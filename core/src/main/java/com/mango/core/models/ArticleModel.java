package com.mango.core.models;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.mango.core.bean.PageBean;
import org.apache.commons.lang3.StringUtils;
import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static com.mango.core.util.Constants.COLON;
import static com.mango.core.util.Constants.SLASH;
import static com.mango.core.util.Constants.TAG_NAMESPACE;
import static com.mango.core.util.Util.createTagNodeIfNotExist;

/**
 * Created by tobywang on 4/17/2018.
 */
@Model(adaptables = Resource.class)
public class ArticleModel {
    private static final Logger LOG = LoggerFactory.getLogger(ArticleModel.class);
    private static final String CONTENT = "/jcr:content";
    
    @Inject
    private Resource resource;
    private PageBean pageBean;
    
    public PageBean getPageBean() {
        return pageBean;
    }
    
    @Inject
    @Optional
    private String articleTitle;
    
    @Inject
    @Optional
    private String[] selectedTags;
    
    public String[] getSelectedTags() {
        return selectedTags;
    }
    
    @Inject
    @Optional
    private Resource articleTags;
    
    public Resource getArticleTags() {
        return articleTags;
    }
    
    @PostConstruct
    protected void init() {
        String pagePath = resource.getPath().split(CONTENT)[0];
        ResourceResolver resolver = resource.getResourceResolver();
        Session session = resolver.adaptTo(Session.class);
        try {
            Node pageNode = JcrUtils.getNodeIfExists(pagePath + CONTENT, session);
            if (StringUtils.isNotEmpty(articleTitle)) {
                pageNode.setProperty("jcr:title", articleTitle);
                pageNode.setProperty("pageTitle", articleTitle);
                session.save();
            }
            if (articleTags != null) {
                List<String> newTags = new ArrayList<>();
                Iterator<Resource> resourceIterator = articleTags.listChildren();
                while (resourceIterator.hasNext()) {
                    Resource name = resourceIterator.next();
                    String tagName = name.getValueMap().get("tagName").toString();
                    String tagid = TAG_NAMESPACE + COLON + createTagNodeIfNotExist(resolver, tagName, tagName);
                    newTags.add(tagid);
                }
                newTags.addAll(Arrays.asList(selectedTags));
                Node currentNode = resource.adaptTo(Node.class);
                currentNode.setProperty("selectedTags", newTags.toArray(new String[0]));
                String articleTagsPath = resource.getPath() + SLASH + "articleTags";
                Node articleTagsNode = JcrUtils.getNodeIfExists(articleTagsPath, session);
                if (articleTagsNode != null) {
                    articleTagsNode.remove();
                }
                session.save();
            }
        } catch (Exception e) {
            LOG.error("error: " +e);
        }
        PageManager pm = resolver.adaptTo(PageManager.class);
        Page page = pm.getPage(pagePath);
        pageBean = new PageBean(page);
    }
}

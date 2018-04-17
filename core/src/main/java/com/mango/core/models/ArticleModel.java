package com.mango.core.models;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.mango.core.bean.PageBean;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by tobywang on 4/17/2018.
 */
@Model(adaptables = Resource.class)
public class ArticleModel {
    
    @Inject
    private Resource resource;
    private PageBean pageBean;
    public PageBean getPageBean() {
        return pageBean;
    }
    
    @Inject
    @Optional
    private Resource articleTags;
    
    public Resource getArticleTags() {
        return articleTags;
    }
    
    @PostConstruct
    protected void init() {
        String currentPath = resource.getPath().split("/jcr:content")[0];
        ResourceResolver resolver = resource.getResourceResolver();
        PageManager pm = resolver.adaptTo(PageManager.class);
        Page page = pm.getPage(currentPath);
        pageBean = new PageBean(page);
    }
}

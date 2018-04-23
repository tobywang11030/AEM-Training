package com.mango.core.models;

import com.day.cq.tagging.Tag;
import com.day.cq.tagging.TagManager;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;


/**
 * Created by tobywang on 4/23/2018.
 */
@Model(adaptables = Resource.class)
public class TagsModel {
    private static final String CONTENT = "/jcr:content";
    @Inject
    private Resource resource;
    
    private Tag[] tags;
    
    public Tag[] getTags() {
        return tags;
    }
    
    @PostConstruct
    protected void init(){
        ResourceResolver resourceResolver = resource.getResourceResolver();
        String pagePath = resource.getPath().split(CONTENT)[0];
        Resource pageResource = resourceResolver.getResource(pagePath);
        TagManager tagManager = resourceResolver.adaptTo(TagManager.class);
        tags = tagManager.getTagsForSubtree(pageResource, false);
    }
}

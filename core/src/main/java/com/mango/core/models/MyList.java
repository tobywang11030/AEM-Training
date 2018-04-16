package com.mango.core.models;

import com.adobe.granite.ui.components.ds.DataSource;
import com.adobe.granite.ui.components.ds.SimpleDataSource;
import com.adobe.granite.ui.components.ds.ValueMapResource;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceMetadata;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.wrappers.ValueMapDecorator;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tobywang on 4/16/2018.
 */
@Model(adaptables = {Resource.class, SlingHttpServletRequest.class })
public class MyList {
    @Inject
    private Resource resource;
    
    @Inject
    @Optional
    private SlingHttpServletRequest request;
    
    @PostConstruct
    protected void init() {
        List<Resource> resourceList = new ArrayList<>();
        ResourceResolver resourceResolver = resource.getResourceResolver();
    
        ValueMap vm = new ValueMapDecorator(new HashMap<>());
        vm.put("text", "a");
        vm.put("value", "1");
        resourceList.add(new ValueMapResource(resourceResolver, new ResourceMetadata(), "nt:unstructured", vm));
        DataSource ds = new SimpleDataSource(resourceList.iterator());
        request.setAttribute(DataSource.class.getName(), ds);
    }
}

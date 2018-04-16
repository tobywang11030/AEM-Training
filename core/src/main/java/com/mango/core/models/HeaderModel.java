/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.mango.core.models;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.mango.core.bean.PageBean;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class HeaderModel {
    
    @Inject
    @Default(values = "/content/mango")
    private String rootPath;
    
    @Inject
    private Resource resource;
    
    private String currentPath;
    
    public String getCurrentPath() {
        return currentPath;
    }
    
    public String getRootPath() {
        return rootPath;
    }
    
    private PageBean pageBean;
    
    private boolean isLogin;
    
    public boolean isLogin() {
        return isLogin;
    }
    
    public PageBean getPageBean() {
        return pageBean;
    }
    
    @PostConstruct
    protected void init() {
        currentPath = resource.getPath().split("/jcr:content")[0];
        ResourceResolver resolver = resource.getResourceResolver();
        PageManager pm = resolver.adaptTo(PageManager.class);
        Page page = pm.getPage(rootPath);
        pageBean = new PageBean(page);
    }
    
}

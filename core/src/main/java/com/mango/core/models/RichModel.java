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

import com.day.cq.dam.api.Asset;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class RichModel {

    @Inject
    @Default(values = "Right")
    private String imagePosition;

    @Inject
    private Resource resource;

    private boolean isVideo;

    public boolean isVideo() {
        return isVideo;
    }

    @Inject
    @Default(values = "")
    private String imagefileReference;

    public String getImagefileReference() {
        return imagefileReference;
    }

    private String mainStyle;
    private String textStyle;
    private String imageStyle;

    public String getImagePosition() {
        return imagePosition;
    }

    public String getTextStyle() {
        return textStyle;
    }

    public String getImageStyle() {
        return imageStyle;
    }

    public String getMainStyle() {
        return mainStyle;
    }

    @PostConstruct
    protected void init() {
        if (imagePosition.equals("Right")) {
            mainStyle = "flex-row";
            textStyle = "flex-order1";
            imageStyle = "flex-order2 m-left";
        } else if (imagePosition.equals("Left")) {
            mainStyle = "flex-row";
            textStyle = "flex-order2";
            imageStyle = "flex-order1 m-right";
        } else if (imagePosition.equals("Bottom")) {
            mainStyle = "flex-conlumn";
            textStyle = "flex-order2";
            imageStyle = "flex-order1 m-middle";

        } else {
            mainStyle = "flex-conlumn";
            textStyle = "flex-order1";
            imageStyle = "flex-order2 m-middle";

        }
        ResourceResolver resolver = resource.getResourceResolver();
        Resource assetResource = resolver.getResource(imagefileReference);
        if (assetResource != null) {
            Asset asset = assetResource.adaptTo(Asset.class);
            String type = asset.getMetadataValue("dc:format");
            if (type.startsWith("video")) {
                isVideo = true;
            } else {
                isVideo = false;
            }
        }

    }

}

package com.mango.core.util;

import com.day.cq.tagging.InvalidTagFormatException;
import com.day.cq.tagging.Tag;
import com.day.cq.tagging.TagManager;
import org.apache.sling.api.resource.ResourceResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.AccessControlException;
import java.util.UUID;

import static com.mango.core.util.Constants.ASSET_TAG_BASE_PATH;
import static com.mango.core.util.Constants.SLASH;
import static com.mango.core.util.Constants.TAG_NAMESPACE;

/**
 * Created by tobywang on 4/17/2018.
 */
public class Util {
    private static final Logger LOG = LoggerFactory.getLogger(Util.class);
    public static String createTagNodeIfNotExist(ResourceResolver resolver, String tagTitle, String tagDescription) {
        String randomTagID = UUID.randomUUID().toString();
        String tagId = SLASH + ASSET_TAG_BASE_PATH + TAG_NAMESPACE + SLASH + randomTagID;
        try {
            TagManager tagManager =  resolver.adaptTo(TagManager.class);
            if (tagManager != null) {
                Tag tag = tagManager.resolve(tagId);
                if (tag == null) {
                    tagManager.createTag(tagId, tagTitle, tagDescription);
                }
            }
        } catch (AccessControlException | InvalidTagFormatException e) {
            LOG.error("Error occured during create Tag : {}", new Object[]{tagId, e});
        }
        return randomTagID;
    }
}

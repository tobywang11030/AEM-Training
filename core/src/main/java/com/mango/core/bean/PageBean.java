package com.mango.core.bean;

import com.day.cq.wcm.api.Page;
import org.apache.sling.api.resource.ValueMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PageBean {
    private final Page page;
    private static final Logger LOG = LoggerFactory.getLogger(PageBean.class);

    /**
     * Create a PageBean for the given Page
     *
     * @param page
     */
    public PageBean(final Page page) {
        if (page == null) {
            throw new IllegalArgumentException("null page parameter not allowed");
        }
        this.page = page;
    }

    /**
     * get the wrapped page
     *
     * @return
     */
    public Page getPage() {
        return page;
    }

    /**
     * Delegates the getParent call to the page object then wraps the result in a PageBean.
     *
     * @return PageBean of parent Page
     */
    public PageBean getParent() {
        Page p = page.getParent();
        if (p == null) {
            return null;
        }
        return new PageBean(p);
    }

    /**
     * Delegates the getParent call to the page object then wraps the result in a PageBean.
     *
     * @param i Level
     * @return PageBean of parent Page
     * @see Page
     */
    public PageBean getParent(final int i) {
        Page p = page.getParent(i);
        if (p == null) {
            return null;
        }
        return new PageBean(p);
    }

    public ValueMap getProperties() {
        return getPage().getProperties();
    }

    public List<PageBean> getChildren() {
        Iterator<Page> childPages = page.listChildren();
        List<PageBean> children = new ArrayList<PageBean>();
        while (childPages.hasNext()) {
            //PageBean childPage = childPages.next();
            children.add(new PageBean(childPages.next()));
        }
        return children;
    }

    public boolean getHasChildren() {
        return this.hasChildren();
    }

    public boolean hasChildren() {
        return !this.getChildren().isEmpty();
    }

    public int getDepth() {
        return page.getDepth();
    }

    /**
     * @return
     */
    public String getPath() {
        return page.getPath();
    }


    /**
     * Delegates the getParent call to the page object then wraps the result in a PageBean.
     *
     * @param i Level
     * @return PageBean of parent Page
     * @see Page
     */
    public PageBean getAbsoluteParent(int i) {
        Page p = page.getAbsoluteParent(i);
        if (p == null) {
            return null;
        }
        return new PageBean(p);
    }



    /**
     * The Page Title is the first non empty field from the following fields: pageTitle, jcr:title
     *
     * @return Page Title
     */
    public String getPageTitle() {
        String pageTitle = getPage().getProperties().get("jcr:title", String.class);
        LOG.debug("pageTitle: {}", pageTitle);
        return pageTitle;
    }

    /**
     * The Navgiation Title is the first non empty field from the following fields: navTitle, jcr:title
     *
     * @return Page Title
     */
    public String getNavTitle() {

        return  getPage().getProperties().get("jcr:title", String.class);

    }

    /**
     * The Page Title Prefix is the prefix to be appended to the beginning of the page title
     *
     * @return Page Title Prefix
     */
    public String getPageTitlePrefix() {
        return this.getPage().getProperties().get("pageTitlePrefix", String.class);
    }

    /**
     * The Page Title is the first non empty field from the following fields: pageTitle, jcr:title
     *
     * @return Page Title
     */
    public String getPageName() {
        String pageName = this.getPage().getName();
        if (pageName.equals("")) {
            pageName = "empty";
        }
        return pageName;
    }

    /**
     * The Page Description
     *
     * @return Page Title
     */
    public String getDescription() {
        return this.getPage().getProperties().get("jcr:description", String.class);
    }
    public String getpageIcon() {
        return this.getPage().getProperties().get("dc:pageIcon", String.class);
    }
    

}

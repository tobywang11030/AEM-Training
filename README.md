# mangoCMS 一个基于Adobe AEM实现的CMS

部署方法
1. 启动AEM
2. 项目根目录下运行 mvn clean install -PautoInstallPackage


相关资料

Adobe 官方教程入口
https://helpx.adobe.com/support/experience-manager/6-3.html

Adobe 官方视频教程入口
https://helpx.adobe.com/experience-manager/kt/index/aem-6-3-videos.html

Adobe 官方实例教程入口，教你一步一步的开发AEM，很实用
附带官方实例源码https://github.com/Adobe-Marketing-Cloud/aem-guides-wknd

AEM Dev Tools For Eclipse https://eclipse.adobe.com/aem/dev-tools/

Repo Tool integration-into-intellij https://github.com/Adobe-Marketing-Cloud/tools/tree/master/repo#integration-into-intellij

AEM分步学习

Table of Contents

In general each Part of the tutorial takes about 1-2 hours.

Part 1

Project Setup - Covers the creation of a Maven Multi Module Project to manage the code and configurations for an AEM Site.
Maven, Lazybones Template, Eclipse IDE, Core Components, SCM, and Github. 

Part 2

Creating a Base Page and Template - Covers the creation of a base page and an editable template. Core Components are proxied into the project.
Editable Templates, Core Components, Content Authoring

Part 3

Client-Side Libraries and Responsive Grid- Covers creation of AEM Client-Side Libraries or clientlibs to deploy and manage CSS and Javascript for an AEM Sites implementation. Integration with AEM's responsive grid and mobile emulator.
Client-Side Libraries, CSS, Javascript, LESS, Bootstrap, Responsive Grid

Part 4

Developing with the Style System  - Covers extending Core Components with brand-specific CSS and leveraging the Style System to create multiple variations of components. This part also uses Content Fragments for long form article content and covers some advanced policy configurations of the Template Editor.
CSS, Style System, Template Editor Policies

Part 5

Navigation and Search  - Covers dynamic navigation driven by the content hierarchy and fixed navigation populated by content authors. Sling Models, HTL templating language, and dialogs are used to implement the Header and Footer navigation. A Quick Search component is also added to the Header.
HTL, Design Dialogs, Composite Components

Part 6

Sling Models and Card Component - Covers the end to end creation of a custom card component that displays a teaser image, title, and description backed by an article page. Includes developing a Sling Model to encapsulate business logic to dynamically populate the card component and corresponding HTL to render the component. Also includes the creation of a design dialog to integrate the Style System in a custom component.
Sling Models, HTL, Style System, Custom Components

Coming Soon...

Additional parts of the tutorial will be added. Below are topics expected to be covered in the future:

Extending Page Properties
Integrating with Social Media
Content Services and Sling Model Exporter

常用技术点

How to Build AEM Projects using Apache Maven
https://helpx.adobe.com/experience-manager/6-4/sites/developing/using/ht-projects-maven.html

动态下拉菜单
https://www.linkedin.com/pulse/granite-datasource-inside-touch-ui-select-object-aem-gonz%C3%A1lez-ramos
https://mkbansal.wordpress.com/2016/01/04/aem-acs-generic-list-dialog-configuration-touch-ui/
https://helpx.adobe.com/experience-manager/using/creating-touchui-validate11.html

Using Translator to Manage Dictionaries
https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/i18n-translator.html

Configuring the Rich Text Editor
https://helpx.adobe.com/experience-manager/6-3/sites/administering/using/rich-text-editor.html#PluginsandtheirFeatures

Components for Page Authoring
https://helpx.adobe.com/experience-manager/6-2/sites/authoring/using/editmode.html#Text

Understanding AEM Content Fragments
https://helpx.adobe.com/experience-manager/kt/sites/using/content-fragments-feature-video-understand.html

使用Multifield
https://helpx.adobe.com/experience-manager/using/multifield_aem63.html

使用SlingModel
https://helpx.adobe.com/experience-manager/using/aem63_htl_repeat_slingmodel.html

Creating an Adobe Experience Manager HTML Template Language component that uses the WCMUsePojo API
https://helpx.adobe.com/experience-manager/using/first_htl_WCMUsePojo.html

SlingModel
https://helpx.adobe.com/experience-manager/using/aem64_coral_resourcetypes.html

创建custom sling servlet
https://helpx.adobe.com/experience-manager/using/resourcetypes.html

创建render component
https://helpx.adobe.com/experience-manager/using/resourcetypes.html#h2Createarendercomponentthatusesthetemplatebrh2

创建一个Servlet service
http://www.6dglobal.com/blog/servlets-sling-case-disappearing-servlet-path-2013-01-31

Sling Servlet service 文档
https://sling.apache.org/documentation/the-sling-engine/servlets.html


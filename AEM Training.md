
# AEM Training

## AEM basic technical knowledge study
### 1. 什么是AEM
#### 1.1 AEM 官方定义
- Adobe Experience Manager is a web-based client-server system for building, managing, and deploying commercial websites and related services.
- A number of infrastructure-level and application-level functions are combined into a single integrated package.
#### 1.2 AEM 自我理解
##### 1.2.1 AEM简要介绍
AEM本质为 Adobe 出品的一个CMS管理系统，相比于市面上其他著名的CMS系统，比如Wordpress,织梦等。 
 ##### 1.2.2 AEM具有以下显著特点：
  **所见即所得**: 一般的CMS系统都会提供很多预开发好的功能和页面，比如首页，文章详情页，文章列表页等页面，然后用户可以在CMS提供的管理后台管理和维护站点的相关信息，或者创建新的文章，而这些管理后台都只是表单型的提交数据到数据库，用户再次进入站点前台页面时，前台页面会读取新的数据配置的页面信息再次渲染出来。一般管理后台长这样：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191107161210499.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGluZ0Jsb2c=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191107161313745.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGluZ0Jsb2c=,size_16,color_FFFFFF,t_70)
而AEM则不需要在一个独立的管理后台中进行表单式的提交数据，而是直接在最终页面上进行编辑，编辑完后直接显示
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191107161449416.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGluZ0Jsb2c=,size_16,color_FFFFFF,t_70)
          **组件化**: 不用于一般CMS由开发商一次开发好所有网站功能，一般以页面为单位，用户只能在管理后台编辑数据的模式，AEM的具有一定逻辑代码的最小单元是组件，AEM平台本身提供了很多常用的组件，比如列表（链接，图片均可），富文本编辑，面包屑，图片，轮播图，表格等组件，开发者也可以开发任何自定义组件，比如上面图中，就是酒店房间列表组件，该组件提供一个编辑窗口来收集房间数据，最终按照开发者写好的HTML进行渲染。
下面是OOTB提供的一些组件：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191107162126799.png)
          **文档型数据库**: 不用于一般的CMS系统使用MySql, SqlServer等关系型数据库，AEM采用文档型数据库（JCR）来存储数据。使用该数据库的显著特点是AEM的程序本身，以及用户所添加的数据，上传的图片等全部存储在AEM实例的所在文件夹中，文件夹结构如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191107162707872.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGluZ0Jsb2c=,size_16,color_FFFFFF,t_70)
#### 1.3 AEM 能做什么
   AEM 作为一个企业级的CMS管理系统，主要用户维护，创建和部署大型商业网站及其服务
#### 1.4 AEM 核心概念
   + Author instance
     Typically, for security, governance, and other reasons, a production site will divide instances of AEM into Author and Publish instances. For more information on deployment architecture (including Author/Publish instances), see documentation about AEM Instances.
	
  + Publish instance
	For security, governance, and other reasons, a production site will typically divide instances of AEM into Author and Publish instances. For more information on deployment architecture (including Author/Publish instances), see documentation about AEM Instances.
	
  + Component
	In AEM, a Component is an object type, instances of which can generally be created by dragging and dropping them from, say, the Sidekick. So for example, out-of-the-box components that ship with AEM include the Text, Title, Tag Cloud, Carousel, Image, and List components, all available from the Sidekick at runtime.
	
  + Digital assets
	In AEM, Digital Assets are (typically) images and rich media files. For further information, see Working with Digital Assets in DAM.
	
  + Template
	In AEM, a Template specifies a particular type of page. It defines the structure of a page (while also typically specifying a thumbnail image, and various properties). For example, you may have separate templates for product pages, sitemaps, and contact information.
	
      + Workflow
	The AEM Workflow system allows for creation of automated processes involving pages or assets.
  
  + Dispatcher
	The Dispatcher is both a caching and load-balancing tool, as well as providing certain security safeguards.
	
  + JCR, Java Content Repository
	The Java Content Repository specification (JSR-283) provides both an abstract data model and an Application Programming Interface for realizing a massively scalable NoSQL data repository that combines features of a file system and an object database. While you do not need to understand JSR-283 in exhaustive detail, you should take time to familiarize yourself with the basic capabilities of JCR and the data model underlying it, because JCR is what makes possible the "everything is content" philosophy of AEM.
	
	In essence, JCR is a system of nodes and properties, in which nodes can inherit from other nodes and all content is stored as property values. Note that in addition to ordinary inheritance, JCR allows for a concept of "mixin" nodes, which enables modelling of multiple inheritance.
	
	JCR has a number of predefined node types and property types, but in general the typing system is quite flexible, and (indeed) one of the strengths of JCR is that it allows structured as well as unstructured content to be stored/managed with equal ease. That is, JCR can accommodate highly structured data, but it can also accommodate arbitrary dynamic data structures without schema constraints.
	
	The JavaDoc for JCR's Java API is here.
	
	Before attempting to read the JavaDoc or the JCR spec itself, you might want to look at this high-level explanation of JCR as implemented by Adobe Experience Services.

	
  + OSGi
	OSGi is the services-based runtime technology that provides the basis for modularized Java development in AEM. It is a framework that provides not only a highly dynamic (and secure) classloading and execution environment for code resources (known as bundles), but also full control over the visibility and lifecycle of the various services exposed by bundles. A service registry provides a cooperation model for bundles that takes lifecycle dynamics (and version requirements) into account. OSGi solves many of the problems that application servers were intended to solve, but does so in a lightweight, highly dynamic way, making it possible, for example, to hot-deploy services (making the new code immediately available without restarting the server).	
	
  + Quickstart
	Unlike many other programs, you install AEM by using a single "Quickstart" self-extracting JAR file. When you double-click the JAR file for the first time, everything you need is automatically installed. The quickstart JAR includes all files required for the CRX repository (including administrative facilities), virtual repository services, index and search services, workflow services, security, and a Web server, plus the CQ Servlet Engine (CQSE) and all AEM services. There are no other files to install: the Quickstart is self-contained.
	
    The first time you start the Quickstart, it creates an entire JCR-compliant repository in the background, which can take several minutes. After this initial startup, subsequent startups are much quicker as the repository infrastructure has already been laid down.
	
    Many startup options (such as the active port number and whether the AEM instance in question should be a Publish instance versus an Author instance; and much more) can be controlled by appropriately renaming the Quickstart file. To see a list of options in this regard, run the JAR with "-help" on the command line:
	**java -jar <quickstartfilename>.jar –help**
  + Replication agents
	Replication agents are central to AEM as the mechanism used to Publish (activate) content from an author to a publish environment; flush content from the Dispatcher cache; return user generated content (for example, form input) from the Publish environment to the Author environment.

  + Tar Storage (TarMK)
	TarMK is the default persistence system in AEM. Although AEM can be configured to use a different persistence system (such as MongoDB), TarMK has certain advantages in that it is performance-optimized for typical JCR use-cases (thus is very fast), uses an industry-standard data format, and can be quickly and easily backed up. Read more here.
### 2. AEM 技术架构
####  2.1 AEM 三大分层和三大核心技术架构图  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191107161013639.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGluZ0Jsb2c=,size_16,color_FFFFFF,t_70)
#### 2.2 AEM 三大核心技术
#####  2.2.1 Apache Sling 
Apache Sling :: Servlet Resolution
			 [https://sling.apache.org/old-stuff/servlet-resolution.html](https://sling.apache.org/old-stuff/servlet-resolution.html)
			Apache Sling :: URL decomposition
			 [http://sling.apache.org/documentation/the-sling-engine/url-decomposition.html](http://sling.apache.org/documentation/the-sling-engine/url-decomposition.html)
			Apache Sling :: HTL Scripting
			 [https://sling.apache.org/documentation/bundles/scripting/scripting-htl.html](https://sling.apache.org/documentation/bundles/scripting/scripting-htl.html)
			Apache Sling :: Sling Models
			 [https://sling.apache.org/documentation/bundles/models.html#specifying-an-alternate-adapter-class-     since-110](https://sling.apache.org/documentation/bundles/models.html#specifying-an-alternate-adapter-class-%20%20%20%20%20since-110)
##### 2.2.2 java JCR & Apache Jackrabbit
Java JSR-170(JCR) 
		JCR规范下载
		[http://download.oracle.com/otndocs/jcp/content_repository-1.0.1-mr-oth-JSpec/index.html](http://download.oracle.com/otndocs/jcp/content_repository-1.0.1-mr-oth-JSpec/index.html)
		Jackrabbit
		依据JCR规范的一个JCR实现类库 [http://jackrabbit.apache.org/jcr/jackrabbit-architecture.html](http://jackrabbit.apache.org/jcr/jackrabbit-architecture.html)
##### 2.2.3 Apache Felix
 一个OSGI实现 官网 [http://felix.apache.org/](http://felix.apache.org/)
#####  2.3. AEM 首选渲染层模板语言：HTL
HTML Template Language (HTL)是AEM所推荐使用的服务器端动态HTML模板语言
		HTL 语法详解
		 [https://github.com/Adobe-Marketing-Cloud/htl-spec/blob/master/SPECIFICATION.md#221-use](https://github.com/Adobe-Marketing-Cloud/htl-spec/blob/master/SPECIFICATION.md#221-use)
		HTL Adobe 官方教程
		 [https://helpx.adobe.com/experience-manager/htl/using/getting-started.html](https://helpx.adobe.com/experience-manager/htl/using/getting-started.html)
### 3. AEM 开发流程图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191107183558735.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L0NvZGluZ0Jsb2c=,size_16,color_FFFFFF,t_70)
### 4. AEM 相关学习资料
#### 4.1 Adobe 官方教程入口 
[https://helpx.adobe.com/support/experience-manager/6-3.html](https://helpx.adobe.com/support/experience-manager/6-3.html)

#### 4.2 Adobe 官方视频教程入口
 [https://helpx.adobe.com/experience-manager/kt/index/aem-6-3-videos.html](https://helpx.adobe.com/experience-manager/kt/index/aem-6-3-videos.html)

#### 4.3 Adobe 官方实例教程入口
教你一步一步的开发AEM，很实用 附带官方实例源码 
[https://github.com/Adobe-Marketing-Cloud/aem-guides-wknd](https://github.com/Adobe-Marketing-Cloud/aem-guides-wknd)

#### 4.4 Adobe官方aem-project-archetype 

```bash
mvn archetype:generate -DarchetypeGroupId=com.adobe.granite.archetypes -DarchetypeArtifactId=aem-project-archetype -DarchetypeVersion=10 -DarchetypeRepository=https://repo.adobe.com/nexus/content/groups/public/
```
#### 4.5 Adobe官方“怎么样实现XX”文章汇总
[https://helpx.adobe.com/experience-manager/topics/how-to.html](https://helpx.adobe.com/experience-manager/topics/how-to.html)
### 5. AEM分步学习
#### 5.1 Part 1 Project Setup 
[https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part1.html](https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part1.html)

#### 5.2 Part 2 Creating a Base Page and Template 
[https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part2.html](https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part2.html)

#### 5.3 Part 3 Client-Side Libraries and Responsive Grid 
[https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part3.html](https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part3.html)

#### 5.4 Part 4 Developing with the Style System
 [https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part4.html](https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part4.html)

#### 5.5 Part 5 Navigation and Search 
[https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part5.html](https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part5.html)

#### 5.5 Part 6 Sling Models and Card Component 
[https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part6.html](https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part6.html)

### 6. 常用技术点
#### 6.1 在线查看AEM的log 
http://localhost:4502/system/console/slinglog
#### 6.2 Create AEM component by using Sling Model 
https://helpx.adobe.com/experience-manager/using/aem63_slingmodel.html
#### 6.3 Create AEM component by using WCMUsePojo 
https://helpx.adobe.com/experience-manager/using/first_htl_WCMUsePojo.html
#### 6.4 Scheduling with a cron expression 
https://sling.apache.org/documentation/bundles/scheduler-service-commons-scheduler.html
#### 6.5 Query Builder API 
https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/querybuilder-api.html
#### 6.6 SSO in AEM 
https://helpx.adobe.com/experience-manager/6-3/sites/deploying/using/single-sign-on.html
#### 6.7 Content Services 
https://helpx.adobe.com/experience-manager/6-4/mobile/using/content-services.html
#### 6.8 Developing AEM Mobile Content Services 
https://helpx.adobe.com/experience-manager/6-4/mobile/using/spaces-and-entities.html
#### 6.9 Getting Started with AEM Content Services 
https://helpx.adobe.com/experience-manager/kt/sites/using/content-services-tutorial-use.html
#### 6.10 Developing Sling Model Exporters in AEM 
https://helpx.adobe.com/experience-manager/kt/platform-repository/using/sling-model-exporter-tutorial-develop.html
#### 6.11 Enabling JSON Export for a Component  
https://helpx.adobe.com/experience-manager/6-3/release-notes/json-exporter-dev-fp.html
#### 6.12 Scripting variables in JSP 
https://cwiki.apache.org/confluence/display/SLING/Scripting+variables#Scriptingvariables-Commonscriptingvariables
#### 6.13 How to Build AEM Projects using Apache Maven 
https://helpx.adobe.com/experience-manager/6-4/sites/developing/using/ht-projects-maven.html
#### 6.14 动态下拉菜单 
https://www.linkedin.com/pulse/granite-datasource-inside-touch-ui-select-object-aem-gonz%C3%A1lez-ramos
https://mkbansal.wordpress.com/2016/01/04/aem-acs-generic-list-dialog-configuration-touch-ui/
https://helpx.adobe.com/experience-manager/using/creating-touchui-validate11.html
#### 6.15 Using Translator to Manage Dictionaries 
https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/i18n-translator.html
#### 6.16 Configuring the Rich Text Editor 
https://helpx.adobe.com/experience-manager/6-3/sites/administering/using/rich-text-editor.html#PluginsandtheirFeatures
#### 6.17 Components for Page Authoring 
https://helpx.adobe.com/experience-manager/6-2/sites/authoring/using/editmode.html#Text
#### 6.18 Understanding AEM Content Fragments 
https://helpx.adobe.com/experience-manager/kt/sites/using/content-fragments-feature-video-understand.html
#### 6.19 使用Multifield 
https://helpx.adobe.com/experience-manager/using/multifield_aem63.html
#### 6.20 使用SlingModel 
https://helpx.adobe.com/experience-manager/using/aem63_htl_repeat_slingmodel.html
#### 6.21 Creating an Adobe Experience Manager HTML Template Language component that uses the WCMUsePojo API 
https://helpx.adobe.com/experience-manager/using/first_htl_WCMUsePojo.html
#### 6.22 SlingModel 
https://helpx.adobe.com/experience-manager/using/aem64_coral_resourcetypes.html
#### 6.23 创建custom sling servlet
https://helpx.adobe.com/experience-manager/using/resourcetypes.html
#### 6.24 创建render component 
https://helpx.adobe.com/experience-manager/using/resourcetypes.html#h2Createarendercomponentthatusesthetemplatebrh2
#### 6.25 创建一个Servlet service 
http://www.6dglobal.com/blog/servlets-sling-case-disappearing-servlet-path-2013-01-31
#### 6.26 Sling Servlet service 文档 
https://sling.apache.org/documentation/the-sling-engine/servlets.html
### 7. Self-Assessment Preparation Worksheet

### 8. Learning plan tracking form
| Topics | Cost(hours) | Details | Reference | Start Date | End Date | Completed? | Questions | Comment |
| ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |

## AEM advanced technical knowledge study

### 1. Self-Assessment Preparation Worksheet

### 2. Learning plan tracking form
| Topics | Cost(hours) | Details | Reference | Start Date | End Date | Completed? | Questions | Comment |
| ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ | ------------ |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |   |   |
























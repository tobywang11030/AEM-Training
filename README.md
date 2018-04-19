<p>
	<br />
</p>
<h1 style="text-align:center;margin-left:0px;color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;">
	mangoCMS 一个基于Adobe AEM实现的CMS
</h1>
<h2 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	部署方法
</h2>
<ol style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<li>
		启动AEM
	</li>
	<li>
		项目根目录下运行 mvn clean install -PautoInstallPackage
	</li>
</ol>
<h2 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	相关资料
</h2>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Adobe 官方教程入口&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="https://helpx.adobe.com/support/experience-manager/6-3.html">https://helpx.adobe.com/support/experience-manager/6-3.html</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Adobe 官方视频教程入口
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://helpx.adobe.com/experience-manager/kt/index/aem-6-3-videos.html">https://helpx.adobe.com/experience-manager/kt/index/aem-6-3-videos.html</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Adobe 官方实例教程入口
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	教你一步一步的开发AEM，很实用 附带官方实例源码&nbsp;<a href="https://github.com/Adobe-Marketing-Cloud/aem-guides-wknd">https://github.com/Adobe-Marketing-Cloud/aem-guides-wknd</a> 
</p>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
		Adobe官方aem-project-archetype&nbsp;
	</h3>
<pre class="prettyprint lang-xml">mvn archetype:generate -DarchetypeGroupId=com.adobe.granite.archetypes -DarchetypeArtifactId=aem-project-archetype -DarchetypeVersion=10 -DarchetypeRepository=https://repo.adobe.com/nexus/content/groups/public/</pre>
	<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
		其中archetypeVersion：8-13.分别含有不同的feature
	</p>
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Adobe官方“怎么样实现XX”文章汇总
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	https://helpx.adobe.com/experience-manager/topics/how-to.html
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	HTL 详细语法
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://github.com/Adobe-Marketing-Cloud/htl-spec/blob/master/SPECIFICATION.md#221-use">https://github.com/Adobe-Marketing-Cloud/htl-spec/blob/master/SPECIFICATION.md#221-use</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Apache Sling :: Sling Models
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://sling.apache.org/documentation/bundles/models.html#specifying-an-alternate-adapter-class-since-110">https://sling.apache.org/documentation/bundles/models.html#specifying-an-alternate-adapter-class-since-110</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	AEM Dev Tools For Eclipse&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="https://eclipse.adobe.com/aem/dev-tools/">https://eclipse.adobe.com/aem/dev-tools/</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Repo Tool integration-into-intellij
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://github.com/Adobe-Marketing-Cloud/tools/tree/master/repo#integration-into-intellij">https://github.com/Adobe-Marketing-Cloud/tools/tree/master/repo#integration-into-intellij</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Maven settings&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="http://helpx.adobe.com/experience-manager/kb/SetUpTheAdobeMavenRepository.html">http://helpx.adobe.com/experience-manager/kb/SetUpTheAdobeMavenRepository.html</a> 
</p>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	运行时加上 -Padobe-public
</p>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<br />
</p>
<h2 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	AEM分步学习
</h2>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Part 1 Project Setup&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part1.html">https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part1.html</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Part 2 Creating a Base Page and Template&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part2.html">https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part2.html</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Part 3 Client-Side Libraries and Responsive Grid&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part3.html">https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part3.html</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Part 4 Developing with the Style System
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part4.html">https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part4.html</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Part 5 Navigation and Search&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part5.html">https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part5.html</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Part 6 Sling Models and Card Component&nbsp;
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<a href="https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part6.html">https://helpx.adobe.com/experience-manager/kt/sites/using/getting-started-wknd-tutorial-develop/part6.html</a>
</p>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<br />
</p>
<h2 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	常用技术点
</h2>
<p>
	<br />
</p>
<ol>
	<li>
		Create AEM component by using Sling Model&nbsp;https://helpx.adobe.com/experience-manager/using/aem63_slingmodel.html
	</li>
	<li>
		How to Build AEM Projects using Apache Maven&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/developing/using/ht-projects-maven.html">https://helpx.adobe.com/experience-manager/6-4/sites/developing/using/ht-projects-maven.html</a> 
	</li>
	<li>
		动态下拉菜单&nbsp;<a href="https://www.linkedin.com/pulse/granite-datasource-inside-touch-ui-select-object-aem-gonz%C3%A1lez-ramos">https://www.linkedin.com/pulse/granite-datasource-inside-touch-ui-select-object-aem-gonz%C3%A1lez-ramos</a><a href="https://mkbansal.wordpress.com/2016/01/04/aem-acs-generic-list-dialog-configuration-touch-ui/">https://mkbansal.wordpress.com/2016/01/04/aem-acs-generic-list-dialog-configuration-touch-ui/</a><a href="https://helpx.adobe.com/experience-manager/using/creating-touchui-validate11.html">https://helpx.adobe.com/experience-manager/using/creating-touchui-validate11.html</a> 
	</li>
	<li>
		Using Translator to Manage Dictionaries&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/i18n-translator.html">https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/i18n-translator.html</a> 
	</li>
	<li>
		Configuring the Rich Text Editor&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-3/sites/administering/using/rich-text-editor.html#PluginsandtheirFeatures">https://helpx.adobe.com/experience-manager/6-3/sites/administering/using/rich-text-editor.html#PluginsandtheirFeatures</a> 
	</li>
	<li>
		Components for Page Authoring&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-2/sites/authoring/using/editmode.html#Text">https://helpx.adobe.com/experience-manager/6-2/sites/authoring/using/editmode.html#Text</a> 
	</li>
	<li>
		Understanding AEM Content Fragments&nbsp;<a href="https://helpx.adobe.com/experience-manager/kt/sites/using/content-fragments-feature-video-understand.html">https://helpx.adobe.com/experience-manager/kt/sites/using/content-fragments-feature-video-understand.html</a> 
	</li>
	<li>
		使用Multifield&nbsp;<a href="https://helpx.adobe.com/experience-manager/using/multifield_aem63.html">https://helpx.adobe.com/experience-manager/using/multifield_aem63.html</a> 
	</li>
	<li>
		使用SlingModel&nbsp;<a href="https://helpx.adobe.com/experience-manager/using/aem63_htl_repeat_slingmodel.html">https://helpx.adobe.com/experience-manager/using/aem63_htl_repeat_slingmodel.html</a> 
	</li>
	<li>
		Creating an Adobe Experience Manager HTML Template Language component that uses the WCMUsePojo API<a href="https://helpx.adobe.com/experience-manager/using/first_htl_WCMUsePojo.html">https://helpx.adobe.com/experience-manager/using/first_htl_WCMUsePojo.html</a> 
	</li>
	<li>
		SlingModel&nbsp;<a href="https://helpx.adobe.com/experience-manager/using/aem64_coral_resourcetypes.html">https://helpx.adobe.com/experience-manager/using/aem64_coral_resourcetypes.html</a> 
	</li>
	<li>
		创建custom sling servlet&nbsp;<a href="https://helpx.adobe.com/experience-manager/using/resourcetypes.html">https://helpx.adobe.com/experience-manager/using/resourcetypes.html</a> 
	</li>
	<li>
		创建render component&nbsp;<a href="https://helpx.adobe.com/experience-manager/using/resourcetypes.html#h2Createarendercomponentthatusesthetemplatebrh2">https://helpx.adobe.com/experience-manager/using/resourcetypes.html#h2Createarendercomponentthatusesthetemplatebrh2</a> 
	</li>
	<li>
		创建一个Servlet service&nbsp;<a href="http://www.6dglobal.com/blog/servlets-sling-case-disappearing-servlet-path-2013-01-31">http://www.6dglobal.com/blog/servlets-sling-case-disappearing-servlet-path-2013-01-31</a> 
	</li>
	<li>
		Sling Servlet service 文档&nbsp;<a href="https://sling.apache.org/documentation/the-sling-engine/servlets.html">https://sling.apache.org/documentation/the-sling-engine/servlets.html</a> 
	</li>
</ol>
<p>
	<br />
</p>
<p>
	<br />
</p>

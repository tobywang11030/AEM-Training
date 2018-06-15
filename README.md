<p>
	<img src="https://github.com/tobywang11030/mangoCMS/raw/master/AEM.png" alt="AEM技术架构图" /> 
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
	AEM技术架构 https://www.processon.com/view/link/5b174207e4b068c25215ef9e
</h2>
<p>
	<br />
</p>
<div class="header parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="header " style="margin:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 id="EditableandStaticTemplates" style="font-style:inherit;font-size:24px;font-family:inherit;">
			Editable and Static Templates
		</h3>
	</div>
</div>
<div class="text parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="text" style="margin:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			AEM now offers two basic types of templates:
		</p>
	</div>
</div>
<div class="procedure parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="procedure" style="margin:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<ul class="steps" style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<div class="proc_par proc_parsys" style="margin:0px;padding:0px 0px 0px 18px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
				<div style="margin:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
					<div class="step" style="margin:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
						<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
							<div class="step" style="margin-left:18px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
								<div style="margin-left:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
									<div class="text parbase" style="margin-left:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
										<div class="text" style="margin-left:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
											<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
												<a href="https://helpx.adobe.com/experience-manager/6-3/sites/authoring/using/templates.html#CreatingandManagingNewTemplates">Editable Templates</a> 
											</p>
											<ul style="font-weight:inherit;font-style:inherit;font-family:inherit;">
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													Can be&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-3/sites/authoring/using/templates.html#CreatingaNewTemplate">created</a>&nbsp;and&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-3/sites/authoring/using/templates.html#EditingaTemplate">edited</a>&nbsp;by template authors using the&nbsp;<b>Template</b>&nbsp;console and editor. The&nbsp;<b>Template</b>&nbsp;console is accessible in the&nbsp;<b>General</b>&nbsp;section of the&nbsp;<b>Tools</b>&nbsp;console.<br />
												</li>
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													After the new page is created a dynamic connection is maintained between the page and the template. This means that changes to the template structure and/or locked content will be reflected on any pages created with that template. Changes to the unlocked (i.e. initial) content will not be reflected.
												</li>
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													Use content policies, which you can define these from the template editor, to persist the design properties. Design mode within the page editor is no longer used for editable templates.
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</li>
					</div>
					<div class="step" style="margin:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
						<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
							<div class="step" style="margin-left:18px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
								<div style="margin-left:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
									<div class="text parbase" style="margin-left:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
										<span style="font-family:inherit;font-style:inherit;font-weight:inherit;">Static Templates</span> 
										<div class="text" style="margin-left:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
											<ul style="font-weight:inherit;font-style:inherit;font-family:inherit;">
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													Static templates have been available for several versions of AEM.<br />
												</li>
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													They are&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/page-templates-static.html">provided by your developers</a>, so they cannot be created or edited by authors.
												</li>
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													Are copied to create the new page, but no dynamic connection exists after this (though the template name is registered for information).<br />
												</li>
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													Use&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-3/sites/authoring/using/default-components-designmode.html">Design Mode</a>&nbsp;to persist design properties.
												</li>
												<li style="font-weight:inherit;font-style:inherit;font-family:inherit;">
													Because editing static templates is the exclusive task of a developer, please see the developer document&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/page-templates-static.html">Page Templates - Static</a>&nbsp;for more information.
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</li>
					</div>
				</div>
			</div>
		</ul>
	</div>
</div>
<div class="text parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<span style="font-family:inherit;font-style:inherit;font-weight:inherit;">By definition, the template console and template editor only allow creation and editing of editable templates. Therefore this document focuses exclusively on editable templates.</span> 
</div>
<p>
	<br />
</p>
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
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Adobe官方aem-project-archetype&nbsp;
</h3>
<pre class="prettyprint lang-xml">mvn archetype:generate -DarchetypeGroupId=com.adobe.granite.archetypes -DarchetypeArtifactId=aem-project-archetype -DarchetypeVersion=10 -DarchetypeRepository=https://repo.adobe.com/nexus/content/groups/public/</pre>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	其中archetypeVersion：8-13.分别含有不同的feature
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Adobe官方“怎么样实现XX”文章汇总
</h3>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	https://helpx.adobe.com/experience-manager/topics/how-to.html
</p>
<h2 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	AEM几个核心技术
</h2>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Apache Sling&nbsp;
</h3>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	官网 http://sling.apache.org/
</h4>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Apache Sling :: Servlet Resolution
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://sling.apache.org/old-stuff/servlet-resolution.html">https://sling.apache.org/old-stuff/servlet-resolution.html</a> 
</p>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Apache Sling :: URL decomposition
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="http://sling.apache.org/documentation/the-sling-engine/url-decomposition.html">http://sling.apache.org/documentation/the-sling-engine/url-decomposition.html</a> 
</p>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Apache Sling :: HTL Scripting
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://sling.apache.org/documentation/bundles/scripting/scripting-htl.html">https://sling.apache.org/documentation/bundles/scripting/scripting-htl.html</a> 
</p>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Apache Sling :: Sling Models
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://sling.apache.org/documentation/bundles/models.html#specifying-an-alternate-adapter-class-since-110">https://sling.apache.org/documentation/bundles/models.html#specifying-an-alternate-adapter-class-since-110</a> 
</p>
<h3 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	java JCR &amp; Apache&nbsp;<span style="color:#333333;font-family:&quot;font-size:15px;background-color:#FFFFFF;">Jackrabbit</span> 
</h3>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	Java JSR-170(JCR)&nbsp;
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	JCR规范下载http://download.oracle.com/otndocs/jcp/content_repository-1.0.1-mr-oth-JSpec/index.html
</p>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<span style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">Jackrabbit</span> 
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	<span style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">依据JCR规范的一个JCR实现类库&nbsp;</span>http://jackrabbit.apache.org/jcr/jackrabbit-architecture.html
</p>
<h3>
	Apache Felix
</h3>
<p>
	一个OSGI实现 官网 http://felix.apache.org/
</p>
<h3>
	HTL
</h3>
<p>
	HTML Template Language (HTL)是AEM所推荐使用的服务器端动态HTML模板语言
</p>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	HTL 语法详解
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://github.com/Adobe-Marketing-Cloud/htl-spec/blob/master/SPECIFICATION.md#221-use">https://github.com/Adobe-Marketing-Cloud/htl-spec/blob/master/SPECIFICATION.md#221-use</a> 
</p>
<h4 style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	HTL Adobe 官方教程
</h4>
<p style="color:#24292E;font-family:-apple-system, BlinkMacSystemFont, &quot;font-size:16px;">
	&nbsp;<a href="https://helpx.adobe.com/experience-manager/htl/using/getting-started.html">https://helpx.adobe.com/experience-manager/htl/using/getting-started.html</a> 
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
	AEM核心概念（Core Concepts）
</h2>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Author instance</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			Typically, for security, governance, and other reasons, a production site will divide instances of AEM into Author and Publish instances. For more information on deployment architecture (including Author/Publish instances), see documentation about&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/deploying/using/deploy.html#AuthorandPublishInstalls">AEM Instances</a>.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Caching, frying, and baking</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			Traditionally, the concepts of baking versus frying are an important distinction between different Web Content Management Systems. &nbsp;In CMS jargon, "baking" refers to the concept of committing data to static files at publish-time, while "frying" refers to the concept of processing data for final presentation at request-time (i.e., just in time).
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Clustering and load-balancing</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			To increase availability and imrpove the performance of a Production environment, it is common to combine multiple Author and/or Publish&nbsp;instances (into&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/deploying/using/recommended-deploys.html#main-pars_title_4">Clusters</a>), by either making them available to different groups of users or by load-balancing them behind a Dispatcher configuration.
		</p>
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			It is also possible to combine multiple instances of the content repository to create a&nbsp;<em>high-availability</em>&nbsp;JCR solution, which can then be integrated with your AEM solution to maximize protection against hardware and software failure. See&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/deploying/using/recommended-deploys.html#main-pars_title_4">Recommended Deployments</a>&nbsp;for further information.&nbsp;
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Component</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			In AEM, a&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/authoring/using/default-components.html">Component</a>&nbsp;is an object type, instances of which can generally be created by dragging and dropping them from, say, the Sidekick. So for example, out-of-the-box components that ship with AEM include the Text, Title, Tag Cloud, Carousel, Image, and List components, all available from the Sidekick at runtime.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Content Finder</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			In authoring mode, the&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/authoring/using/author-environment-tools.html#TheContentFinderClassicUI">Content Finder</a>&nbsp;is a special panel (frame) on the left-hand side of the page that, depending on the tab you select at the top, displays lists of images, documents, Flash assets, pages, paragraphs, or repository resources that you can drag and drop from the Content Finder into the page you're working on (on the right).
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Digital assets</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			In AEM, Digital Assets are (typically) images and rich media files. For further information, see&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/assets/using/assets.html">Working with Digital Assets in DAM</a>.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Dispatcher</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			The&nbsp;<a href="https://helpx.adobe.com/experience-manager/dispatcher/user-guide.html">Dispatcher</a>&nbsp;is both a caching and load-balancing tool, as well as providing certain security safeguards.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">JCR, Java Content Repository</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			The&nbsp;<a href="http://www.day.com/specs/jcr/2.0/index.html">Java Content Repository specification</a>&nbsp;(JSR-283) provides both an abstract data model and an Application Programming Interface for realizing a massively scalable NoSQL data repository that combines features of a file system and an object database. While you do not need to understand JSR-283 in exhaustive detail, you should take time to familiarize yourself with the basic capabilities of JCR and the data model underlying it, because JCR is what makes possible the "everything is content" philosophy of AEM.
		</p>
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			In essence, JCR is a system of nodes and properties, in which nodes can inherit from other nodes and all content is stored as property&nbsp;<i>values</i>. Note that in addition to ordinary inheritance, JCR allows for a concept of "mixin" nodes, which enables modelling of multiple inheritance.
		</p>
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			JCR has a number of predefined node types and property types, but in general the typing system is quite flexible, and (indeed) one of the strengths of JCR is that it allows structured as well as unstructured content to be stored/managed with equal ease. That is, JCR can accommodate highly structured data, but it can also accommodate arbitrary dynamic data structures without schema constraints.
		</p>
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			The JavaDoc for JCR's Java API is&nbsp;<a href="http://www.day.com/maven/javax.jcr/javadocs/jcr-2.0/index.html">here</a>.
		</p>
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			Before attempting to read the JavaDoc or the JCR spec itself, you might want to look at&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/developing/using/the-basics.html#JavaContentRepository">this high-level explanation</a>&nbsp;of JCR as implemented by Adobe Experience Services.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Multi-Site Manager (MSM)</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			The&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/administering/using/msm.html">MSM</a>&nbsp;feature of AEM helps customers handle multilingual and multinational content, enabling them to balance centralized branding with localized content.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">OSGi</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<a href="http://www.osgi.org/About/Technology">OSGi</a>&nbsp;is the services-based runtime technology that provides the basis for modularized Java development in AEM. It is a framework that provides not only a highly dynamic (and secure) classloading and execution environment for code resources (known as&nbsp;<i>bundles</i>), but also full control over the visibility and lifecycle of the various services exposed by bundles. A service registry provides a cooperation model for bundles that takes lifecycle dynamics (and version requirements) into account. OSGi solves many of the problems that application servers were intended to solve, but does so in a lightweight, highly dynamic way, making it possible, for example, to hot-deploy services (making the new code immediately available without restarting the server).
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Parsys, Paragraph System</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			The&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/authoring/using/default-components-designmode.html#ParagraphSystemparsys">paragraph system</a>&nbsp;(parsys) is a compound component that allows authors to add components of different types to a page and contains other paragraph components. Each paragraph type is represented as a component. The paragraph system itself is also a component, which contains the other paragraph components.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Microkernel</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			Every workspace in the repository can be separately configured to store its data through a specific&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/deploying/using/storage-elements-in-aem-6.html">microkernel</a>&nbsp;(a class that manages the reading and writing of the data). Similarly, the repository-wide version store can also be independently configured to use a particular microkernel. A number of different microkernels are available, capable of storing data in a variety of file formats or relational databases. (For example, there are persistence managers for MongoDB, DB2 or Oracle) The default microkernel for AEM is TarMK (see further below).
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Publish instance</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			For security, governance, and other reasons, a production site will typically divide instances of AEM into Author and Publish instances. For more information on deployment architecture (including Author/Publish instances), see documentation about&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/deploying/using/deploy.html#AuthorandPublishInstalls">AEM Instances</a>.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Quickstart</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			Unlike many other programs, you install AEM by using a single "Quickstart" self-extracting JAR file. When you double-click the JAR file for the first time, everything you need is automatically installed. The quickstart JAR includes all files required for the CRX repository (including administrative facilities), virtual repository services, index and search services, workflow services, security, and a Web server, plus the CQ Servlet Engine (CQSE) and all AEM services. There are no other files to install: the Quickstart is self-contained.
		</p>
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			The first time you start the Quickstart, it creates an entire JCR-compliant repository in the background, which can take several minutes. After this initial startup, subsequent startups are much quicker as the repository infrastructure has already been laid down.
		</p>
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			Many startup options (such as the active port number and whether the AEM instance in question should be a Publish instance versus an Author instance; and much more) can be controlled by appropriately renaming the Quickstart file. To see a list of options in this regard, run the JAR with "-help" on the command line:
		</p>
	</div>
</div>
<div class="codeblock parbase section" style="margin:0px;padding:3px 0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div style="margin:0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<div id="highlighter_939059" class="syntaxhighlighter nogutter shell" style="padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;margin:1em 0px !important;font-size:1em !important;">
			<table border="0" cellpadding="0" cellspacing="0" style="color:#333333;width:823px;margin:0px !important;padding:0px !important;border:0px !important;font-size:1em !important;font-family:Consolas, &quot;background:none !important;height:auto !important;" class="ke-zeroborder">
				<tbody>
					<tr>
						<td class="code" style="font-weight:bold;background:none 0px 0px repeat scroll #EDEDED;border:0px !important;font-size:1em !important;font-family:Consolas, &quot;vertical-align:baseline !important;">
							<div class="container" style="margin:0px !important;padding:0px !important;border:0px !important;font-weight:normal !important;font-size:1em !important;background:none !important;vertical-align:baseline !important;">
								<div class="line number1 index0 alt2" style="margin:0px !important;padding:0px 1em 0px 0em !important;border:0px !important;font-size:1em !important;background:none white !important;vertical-align:baseline !important;">
									java -jar &lt;quickstartfilename&gt;.jar –help
								</div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Replication agents</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<a href="https://helpx.adobe.com/experience-manager/6-4/sites/deploying/using/replication.html">Replication</a>&nbsp;agents are central to AEM as the mechanism used to&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/authoring/using/publishing-pages.html#ActivatingContent">Publish (activate)</a>&nbsp;content from an author to a publish environment; flush content from the Dispatcher cache; return user generated content (for example, form input) from the Publish environment to the Author environment.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Scaffolding</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			With&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/authoring/using/scaffolding.html">scaffolding</a>&nbsp;you can create a form (a scaffold) with fields that reflect the structure you want for your pages and then use this form to easily create pages based on this structure.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Segmentation</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			Site visitors have different interests and objectives when they come to a site. Understanding visitors' goals and fulfilling their expectations is an important success prerequisite for online marketing.&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/administering/using/campaign-segmentation.html">Segmentation</a>&nbsp;helps to achieve this by analyzing and characterizing a visitor's details.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Sidekick</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			The&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/authoring/using/basic-handling.html#Sidekick">Sidekick</a>&nbsp;is a palette-like floating window that appears on the editable page, from which new components can be dragged and actions that apply to the page can be executed.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Site Catalyst</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<a href="https://helpx.adobe.com/experience-manager/6-4/sites/administering/using/adobeanalytics.html">SiteCatalyst</a>&nbsp;provides marketers with one place to measure, analyze, and optimize integrated data from all online initiatives across multiple marketing channels. You can use Adobe SiteCatalyst to analyze data from AEM websites.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Tar Storage (TarMK)</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			TarMK is the default persistence system in AEM. Although AEM can be configured to use a different persistence system (such as MongoDB), TarMK has certain advantages in that it is performance-optimized for typical JCR use-cases (thus is very fast), uses an industry-standard data format, and can be quickly and easily backed up. Read more&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/deploying/using/platform.html">here</a>.
		</p>
	</div>
</div>
<div class="variable parbase section" style="margin:0px;padding:0px;border:0px;font-size:16px;font-family:adobe-clean, HelveticaNeue-light, &quot;color:#333333;background-color:#FFFFFF;">
	<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Template</span> 
		</h3>
	</div>
	<div class="variable-text" style="margin:28px 0px;padding:0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
		<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
			In AEM, a&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/authoring/using/managing-pages.html#Templates">Template</a>&nbsp;specifies a particular type of page. It defines the structure of a page (while also typically specifying a thumbnail image, and various properties). For example, you may have separate templates for product pages, sitemaps, and contact information.
		</p>
	</div>
</div>
<p>
	<br />
</p>
<div class="help-variable" style="margin:0px;padding:0px 16px 0px 0px;border:0px;font-weight:inherit;font-style:inherit;font-family:inherit;">
	<h3 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
		<span class="help-variable-title" style="font-weight:bold;font-style:inherit;font-family:inherit;">Workflow</span> 
	</h3>
</div>
<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
	The AEM&nbsp;<a href="https://helpx.adobe.com/experience-manager/6-4/sites/administering/using/workflows.html">Workflow</a>&nbsp;system allows for creation of automated processes involving pages or assets.
</p>
<p style="font-weight:inherit;font-style:inherit;font-family:inherit;">
	<br />
</p>
<h2 style="font-weight:inherit;font-style:inherit;font-family:inherit;">
	其他术语
</h2>
<p>
	<table class="MsoNormalTable" border="1" cellspacing="0" cellpadding="0" style="border:none;">
		<tbody>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">AEM </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Adobe
  Experience Manager, a web content management system from Adobe built on top
  of Sling </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Apache </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Apache
  HTTP Server, a general-purpose web server </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Apache Sling </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Content-driven
  framework for building web applications in Java </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Atomic broadcast </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Broadcast
  primitive in distributed systems that requires that all nodes receive
  broadcast messages reliably and in the same order </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Big flip </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Approach
  to updating distributed systems where a cluster of nodes is updated one half
  at a time, such that the two halves are not online concurrently during
  updates </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Bundle </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  JAR package specifically adapted to be deployed to an OSGi framework </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Component </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  functional module in OSGi </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Config </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">In
  this thesis, a particular version of a Sling application </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Content repository </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Abstract
  data store defined by JCR that Sling uses as the data tier </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Crank file </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  file defining an OSGi application that can be started by Crankstart </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Crankstart </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">OSGi
  application launcher that starts and configures an OSGi framework according
  to commands in a crank file </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Dependency hell </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Situation
  in which the graph of dependencies of a software package includes
  dependencies on multiple versions of the same third-party package, which
  cannot be loaded into a system at the same time without proper isolation </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Health check </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  test in Sling with an expected result, useful for checking whether certain
  conditions in a running Sling instance are satisfied </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Home directory </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  directory on the host file system that Sling, OSGi, and JCR use for storing
  configuration, logs, and other bookkeeping records </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">HTTP endpoint </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  URL under which a Sling instance can be reached </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">HTTP front-end </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  server that maintains a pool of web servers to which it forwards incoming
  HTTP requests </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Jackrabbit </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Reference
  implementation of JCR, used as the default JCR implementation in Sling </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">JAR hell </span></b><span style="font-size:11.5pt;"></span> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Dependency
  hell specific to the Java platform </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">JCR </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Java
  Content Repository, specification that defines an abstract model and a Java
  API for data management and storage </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Launchpad </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Default
  Sling application launcher </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Minion </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">In
  this thesis, one of the Sling instances running a particular version of a
  Sling application </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Oak </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">An
  implementation of JCR that focuses on scalability and performance </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Online update </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">An
  update that satisfies two properties: atomicity and zero downtime </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Orchestrator </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">In
  this thesis, application managing the continuous delivery mechanism,
  responsible for spawning and stopping Minions </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">OSGi </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Set
  of specifications that define a dynamic component model for Java </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">OSGi framework </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Environment,
  similar to a container, that hosts an OSGi application </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Resource </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  piece of data available to Sling </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Resource resolver </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  component responsible for finding (resolving) resources in Sling given their
  paths </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">RESTful </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Conforming
  to REST (Representational State Transfer) style of HTTP requests, where
  requests make use of URIs and HTTP methods (GET, POST, PUT, DELETE) in a way
  that makes each request self-descriptive </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Rolling upgrade </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Approach
  to updating distributed systems where each node in a cluster is updated one
  at a time </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Script </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  Sling component for handling HTTP requests, similar to a servlet,
  programmable in languages other than Java </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Service </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">An
  interface through which OSGi components communicate </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Service registry </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">OSGi
  module keeping track of all available services </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Servlet </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  Java component for handling HTTP requests </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Sling </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">See
  Apache Sling </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Virtual resource </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">A
  resource in Sling that does not reside in the content repository </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">Workspace </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">An
  element of a JCR repository that contains a tree of data nodes, intended for
  being used as a branch of the repository content </span> 
					</p>
				</td>
			</tr>
			<tr>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<b><span style="font-size:11.5pt;">ZooKeeper </span></b> 
					</p>
				</td>
				<td width="300" valign="top" style="border:none;">
					<p class="Default">
						<span style="font-size:11.5pt;font-family:&quot;">Cluster
  coordination service that provides services that require atomic broadcast </span> 
					</p>
				</td>
			</tr>
		</tbody>
	</table>
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
		Create AEM component by using WCMUsePojo&nbsp;https://helpx.adobe.com/experience-manager/using/first_htl_WCMUsePojo.html
	</li>
	<li>
		Scheduling with a cron expression&nbsp;https://sling.apache.org/documentation/bundles/scheduler-service-commons-scheduler.html
	</li>
		<li>
		Query Builder API&nbsp;https://helpx.adobe.com/experience-manager/6-3/sites/developing/using/querybuilder-api.html
	</li>
		<li>
		Scripting variables in JSP&nbsp;https://cwiki.apache.org/confluence/display/SLING/Scripting+variables#Scriptingvariables-Commonscriptingvariables
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

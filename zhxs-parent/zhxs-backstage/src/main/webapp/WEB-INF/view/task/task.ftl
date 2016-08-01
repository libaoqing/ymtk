<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
<head>
	<meta  http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title></title>
</head>
<body class="page-header-fixed">
	<div class="page-container row-fluid">
		<div class="page-content">
			<div id="portlet-config" class="modal hide">
				<div class="modal-header">
					<button data-dismiss="modal" class="close" type="button"></button>
					<h3>Widget Settings</h3>
				</div>
			</div>
			<div class="container-fluid">	<!-- BEGIN PAGE HEADER-->
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN STYLE CUSTOMIZER -->
						<div class="color-panel hidden-phone">
							<div class="color-mode-icons icon-color"></div>
							<div class="color-mode-icons icon-color-close"></div>
							<div class="color-mode">
								<p>THEME COLOR</p>
								<ul class="inline">
									<li class="color-black current color-default" data-style="default"></li>

									<li class="color-blue" data-style="blue"></li>

									<li class="color-brown" data-style="brown"></li>

									<li class="color-purple" data-style="purple"></li>

									<li class="color-grey" data-style="grey"></li>

									<li class="color-white color-light" data-style="light"></li>

								</ul>

								<label>

									<span>Layout</span>

									<select class="layout-option m-wrap small">

										<option value="fluid" selected>Fluid</option>

										<option value="boxed">Boxed</option>

									</select>

								</label>

								<label>

									<span>Header</span>

									<select class="header-option m-wrap small">

										<option value="fixed" selected>Fixed</option>

										<option value="default">Default</option>

									</select>

								</label>

								<label>

									<span>Sidebar</span>

									<select class="sidebar-option m-wrap small">

										<option value="fixed">Fixed</option>

										<option value="default" selected>Default</option>

									</select>

								</label>

								<label>

									<span>Footer</span>

									<select class="footer-option m-wrap small">

										<option value="fixed">Fixed</option>

										<option value="default" selected>Default</option>

									</select>

								</label>

							</div>

						</div>
						<h3 class="page-title">
							任务管理
						</h3>

						<ul class="breadcrumb">

							<li>
								<i class="icon-home"></i>
								<a href="index.html">Home</a>
								<i class="icon-angle-right"></i>
							</li>
							<li><a href="#">任务管理</a></li>
							<li class="pull-right no-text-shadow">
							</li>
						</ul>
						<!-- END PAGE TITLE & BREADCRUMB-->
					</div>
				</div>
				<!-- END PAGE HEADER-->
				<div class="row-fluid ">
					<div class="span6" style="margin-right:0px;">
						<div class="portlet solid">
							<div class="alert" style="background-color:#ffede7;color:#f86333">
								<strong>很重要-很紧急</strong>
							</div>
							<div class="portlet-body">
								<div id="gmap_basic" class="gmaps"></div>
							</div>
						</div>
					</div>
					<div class="span6" style="margin-left:0px">
						<div class="portlet solid">
							<div class="alert" style="background-color:#ffefcb;color:#feae6a">
								<strong>重要-不紧急</strong>
							</div>
							<div class="portlet-body">
								<div id="gmap_basic" class="gmaps"></div>
							</div>
						</div>
					</div>
				<div class="row-fluid">
					<div class="span6" style="margin-right:0px">
						<div class="portlet solid">
							<div class="alert" style="background-color:#d6f4fe;color:#3fb6da">
								<strong>不重要-紧急</strong> 
							</div>
							<div class="portlet-body">
								<div id="gmap_basic" class="gmaps"></div>
							</div>
						</div>
					</div>
					<div class="span6" style="margin-left:0px">
						<div class="portlet solid">
							<div class="alert" style="background-color:#eeffdd;color:#b4cc57">
								<strong>不重要-不紧急</strong>
							</div>
							<div class="portlet-body">
								<div id="gmap_basic" class="gmaps"></div>
							</div>
						</div>
					</div>
				</div>
				</div>
			</div>    
		</div>
	</div>
	<script src="${request.contextPath}/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="${request.contextPath}/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="${request.contextPath}/media/js/bootstrap.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
	<script src="${request.contextPath}/media/js/excanvas.min.js"></script>
	<script src="${request.contextPath}/media/js/respond.min.js"></script>  
	<![endif]-->   
	<script src="${request.contextPath}/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.blockui.min.js" type="text/javascript"></script>  
	<script src="${request.contextPath}/media/js/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	<script src="${request.contextPath}/media/js/jquery.vmap.js" type="text/javascript"></script>   
	<script src="${request.contextPath}/media/js/jquery.vmap.russia.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.vmap.world.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.vmap.europe.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.vmap.germany.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.vmap.usa.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.vmap.sampledata.js" type="text/javascript"></script>  
	<script src="${request.contextPath}/media/js/jquery.flot.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.flot.resize.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.pulsate.min.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/date.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/daterangepicker.js" type="text/javascript"></script>     
	<script src="${request.contextPath}/media/js/jquery.gritter.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/fullcalendar.min.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.easy-pie-chart.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/jquery.sparkline.min.js" type="text/javascript"></script>  
	<script src="${request.contextPath}/media/js/app.js" type="text/javascript"></script>
	<script src="${request.contextPath}/media/js/index.js" type="text/javascript"></script>        
	<script>
		jQuery(document).ready(function() {    
		   App.init(); // initlayout and core plugins
		   Index.init();
		   Index.initJQVMAP(); // init index page's custom scripts
		   Index.initCalendar(); // init index page's custom scripts
		   Index.initCharts(); // init index page's custom scripts
		   Index.initChat();
		   Index.initMiniCharts();
		   Index.initDashboardDaterange();
		   Index.initIntro();
		});
	</script>
<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>
</html>
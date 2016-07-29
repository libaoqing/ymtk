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
			<div class="container-fluid">
				<div class="row-fluid ">
					<div class="span2">
						<p>2016-07-25</p>
					</div>
					<div class="btn-group">
						<button class="btn">今天</button>
						<button class="btn">日</button>
						<button class="btn">周</button>
						<button class="btn">月</button>
					</div>
					<div class="btn-group rigth">
						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">时间轴<i class="icon-angle-down"></i></a>
						<ul class="dropdown-menu">
							<li><a href="#">时间轴</a></li>
							<li><a href="#">四象限</a></li>
						</ul>
					</div>
					<div class="btn-group rigth">
						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">全部<i class="icon-angle-down"></i></a>
						<ul class="dropdown-menu">
							<li><a href="#">全部</a></li>
							<li><a href="#">已完成</a></li>
							<li><a href="#">未已完成</a></li>
						</ul>
					</div>
				</div>
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
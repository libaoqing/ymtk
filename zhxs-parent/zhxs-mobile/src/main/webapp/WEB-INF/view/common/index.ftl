<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <base href="/mobile/demo/" />
    <title>Mobile Angular UI Demo</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimal-ui" />
    <meta name="apple-mobile-web-app-status-bar-style" content="yes" />
    <link rel="shortcut icon" href="/favicon.png" type="image/x-icon" />
    <link rel="stylesheet" href="${request.contextPath}/mobile/dist/css/mobile-angular-ui-hover.min.css" />
    <link rel="stylesheet" href="${request.contextPath}/mobile/dist/css/mobile-angular-ui-base.min.css" />
    <link rel="stylesheet" href="${request.contextPath}/mobile/dist/css/mobile-angular-ui-desktop.min.css" />
    <link rel="stylesheet" href="${request.contextPath}/mobile/demo/demo.css" />
    <script src="http://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.0/angular.min.js"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/angular.js/1.3.0/angular-route.min.js"></script>
    <script src="${request.contextPath}/mobile/dist/js/mobile-angular-ui.min.js"></script>
    <!-- Required to use $touch, $swipe, $drag and $translate services -->
    <script src="${request.contextPath}/mobile/dist/js/mobile-angular-ui.gestures.min.js"></script>
    <script src="${request.contextPath}/mobile/demo/demo.js"></script>
  </head>

  <body 
    ng-app="MobileAngularUiExamples" 
    ng-controller="MainController"
    ui-prevent-touchmove-defaults
    >

    <!-- Sidebars -->
    <div ng-include="'${request.contextPath}/mobile/demo/sidebar.html'" 
            ui-track-as-search-param='true'
            class="sidebar sidebar-left"></div>

    <div ng-include="'${request.contextPath}/mobile/demo/sidebarRight.html'" 
            class="sidebar sidebar-right"></div>

    <div class="app" 
         ui-swipe-right='Ui.turnOn("uiSidebarLeft")'
         ui-swipe-left='Ui.turnOff("uiSidebarLeft")'>

      <!-- Navbars -->

      <div class="navbar navbar-app navbar-absolute-top">
        <div class="navbar-brand navbar-brand-center" ui-yield-to="title">
          日程管理
        </div>
        <div class="btn-group pull-left">
          <div ui-toggle="uiSidebarLeft" class="btn sidebar-toggle">
            <i class="fa fa-bars"></i> Menu
          </div>
        </div>
        <div class="btn-group pull-right" ui-yield-to="navbarAction">
          <div ui-toggle="uiSidebarRight" class="btn">
            <i class="fa fa-comment"></i> Chat
          </div>
        </div>
      </div>

	<!--
      <div class="navbar navbar-app navbar-absolute-bottom">
        <div class="btn-group justified">
			<a href="/docs" class="btn btn-navbar"><i class="fa fa-home fa-navbar"></i>任务</a>
          <a href="/docs" class="btn btn-navbar"><i class="fa fa-home fa-navbar"></i> 好友</a>
          <a href="https://github.com/mcasimir/mobile-angular-ui" class="btn btn-navbar"><i class="fa fa-github fa-navbar"></i>活动</a>
          <a href="https://github.com/mcasimir/mobile-angular-ui/issues" class="btn btn-navbar"><i class="fa fa-exclamation-circle fa-navbar"></i> 设置</a>
        </div>
      </div>
	-->
	
      <!-- App Body -->
      <div class="app-body" ng-class="{loading: loading}">
        <div ng-show="loading" class="app-content-loading">
          <i class="fa fa-spinner fa-spin loading-spinner"></i>
        </div>
        <div class="app-content">
          <sitemesh:write property='body' />
        </div>
      </div>

    </div><!-- ~ .app -->

    <div ui-yield-to="modals"></div>

    <script>
       (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
       (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
       m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
       })(window,document,'script','http://www.google-analytics.com/analytics.js','ga');

       ga('create', 'UA-48036416-1', 'mobileangularui.com');
       ga('send', 'pageview');
     </script>
  </body>
</html>

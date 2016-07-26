<!DOCTYPE html>
<html ng-app="ionicApp">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
    <title>菜鸟教程(runoob.com)</title>
    <link href="${request.contextPath}/ionic/css/ionic.min.css" rel="stylesheet">
    <script src="${request.contextPath}/ionic/js/ionic.bundle.min.js"></script>
    <script type="text/javascript">
    angular.module('ionicApp', ['ionic'])

    .controller('MyCtrl', function($scope) {

    });
    </script>
    <style>
    body {
    cursor: url('http://www.runoob.com/static/img/finger.png'), auto;
    }
    </style>
</head>
<body ng-controller="MyCtrl">

    <div class="bar bar-header bar-dark">
  <h1 class="title">Header</h1>
</div>
<div class="tabs-striped tabs-top tabs-background-positive tabs-color-light">
      <div class="tabs">
<i class="icon ion-home"></i>
        <a class="tab-item" href="#">
          测试
        </a>
        <a class="tab-item" href="#">
          收藏
        </a>
        <a class="tab-item active" href="#">
          设置
        </a>
      </div>
    </div>

<div class="content has-header">

      <ul class="list">

        <li class="item">
          Battletoads
        </li>
        <li class="item">
          Contra
        </li>
        <li class="item">
          Duck Tales
        </li>
        <li class="item">
          Mega Man
        </li>
        <li class="item">
          Metroid
        </li>
        <li class="item">
          Mike Tyson's Punch-Out
        </li>
        <li class="item">
          R.C. Pro-Am
        </li>
        <li class="item">
          Spy Hunter
        </li>
        <li class="item">
          Super Mario Bros.
        </li>
        <li class="item">
          The Legend of Zelda
        </li>

      </ul>

    </div>
    

    </body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
  <title>Login Page | Amaze UI Example</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="format-detection" content="telephone=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="alternate icon" type="image/png" href="assets/i/favicon.png">
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <style>
    .header {
      text-align: center;
    }
    .header h1 {
      font-size: 200%;
      color: #333;
      margin-top: 30px;
    }
    .header p {
      font-size: 14px;
    }
  </style>
</head>
<body>
<div class="header">
  <div class="am-g">
    <h1>学生信息管理系统</h1>
    <p>欢迎使用学生管理系统<br/>请使用您的账户登录</p>
  </div>
  <hr />
</div>
<div class="am-g">
  <div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <h1>登录</h1>
    <hr>
    <div class="am-btn-group">
      <a href="#" class="am-btn am-btn-secondary am-btn-sm"><i class="am-icon-qq am-icon-sm"></i> QQ</a>
      <a href="#" class="am-btn am-btn-success am-btn-sm"><i class="am-icon-weixin am-icon-sm"></i> 微信+</a>
      <a href="#" class="am-btn am-btn-danger am-btn-sm"><i class="am-icon-weibo am-icon-sm"></i> 微博</a>
    </div>
    <br>
    <br>

    <form method="post" action="<c:url value="/login.do"/>" class="am-form">
      <label for="text">账户:</label>
      <input type="text" required name="username" id="text" value="">
      <br>
      <label for="password">密码:</label>
      <input type="password" required name="password" id="password" value="">
      <br>
      <label for="remember-me">
        <input id="remember-me" type="checkbox">
        记住密码
      </label>
      <br />
      <div class="am-cf">
        <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl">
        <input type="text" name="" value="注 册 " class="am-btn am-btn-default am-btn-sm am-fr">
      </div>
      <p><span class="am-text-danger">${message}</span></p>
    </form>
    <hr>
    <p>© 2017 AllMobilize, Inc. Licensed under MIT license.</p>
  </div>
</div>
</body>
</html>

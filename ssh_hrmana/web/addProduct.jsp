<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/5
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎你：<s:property value="#session.existEmployee.ename"/> </h1>
<a href="${pageContext.request.contextPath}/department_findAll.action">商品管理</a>
</body>
</html>

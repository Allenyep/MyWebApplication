<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/6/12
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=GBK" isErrorPage="true" pageEncoding="UTF-8"%>
<%response.setStatus(HttpServletResponse.SC_OK);%>
<html>
<head>
    <title>404未能找到页面</title>
</head>
<body>
    <img src="${pageContext.request.contextPath}/static/img/404.gif" onclick="location='${pageContext.request.contextPath}/index.jsp'">
</body>
</html>

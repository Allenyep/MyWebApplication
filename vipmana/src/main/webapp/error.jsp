<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/6/12
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=GBK" isErrorPage="true" pageEncoding="UTF-8"%>
<%response.setStatus(HttpServletResponse.SC_OK);%>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
<h1>500</h1>
<h4>未知错误发生了</h4>
<%
    /** *//**
 * 本页面是在客户查找的页面无法找到的情况下调用的
 */
    response.setStatus(HttpServletResponse.SC_OK);
%>
<body>
正在制作 <a href="javascript:history.go(-1)">返回上一页</a>
<br/>
<a onclick="location='${pageContext.request.contextPath}/index.jsp'">返回首页</a>
<br/>
也可能页面连接更改了，请按 F5 键刷新整个页面看看，特别是菜单！
</body>
</body>
</html>

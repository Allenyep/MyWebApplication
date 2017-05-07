<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/4
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <s:form action="employee_login.action" namespace="/" method="POST">
    <h2>登录</h2>
    账号:<input type="text" name="username"/><br>
    密码:<input type="password" name="password"/><br>
    <input type="submit" value="登录"/>
  </s:form>
  </body>
</html>

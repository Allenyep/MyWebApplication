<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/6/23
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
${message}
<form action="login.do" method="post">
    <label>账户</label><input type="text" name="username"/><br>
    <label>密码</label><input type="password" name="password"/><br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
</body>
</html>

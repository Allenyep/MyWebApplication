<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/2
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/users/Users_login.action" method="post">
    用户名:<input type="text" name="username"/><br>
    密码:<input type="password" name="password"/><br>
    <input type="submit" value="Login">
</form>
</body>
</html>

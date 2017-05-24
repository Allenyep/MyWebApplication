<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/24
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
</head>
<body>
<strong>${message}</strong>
<form action="${pageContext.request.contextPath}/updatepassword.do" method="post">
    <p>旧密码:<label>
        <input name="oldPassword" type="password"/>
    </label></p>
    <p>新密码:<label>
        <input name="newPassword" type="password"/>
    <p>确认新密码:<label>
        <input name="newPasswordConfirm" type="password"/>
    </label></p>
    <input type="submit" value="update"/>
    <a href="${pageContext.request.contextPath}/welcome.do">返回</a>
</form>
</body>
</html>

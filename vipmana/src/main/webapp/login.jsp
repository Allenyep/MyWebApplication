<%@page pageEncoding="utf-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <h4>${message}</h4>
    <form action="${pageContext.request.contextPath}/login.do" method="post">
        <p>account:<label>
            <input name="account" type="text"/>
        </label></p>
        <p>password:<label>
            <input name="password" type="password"/>
        </label></p>
        <input type="submit" value="login"/>
    </form>
</body>
</html>

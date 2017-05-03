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
    <title>login_success</title>
</head>
<body>

${sessionScope.username}，欢迎你
登录成功<br>
<a href="<%=request.getContextPath()%>/users/Users_logout.action">退出</a>
<a href="<%=request.getContextPath()%>/students/Students_query_success.jsp">学生列表</a>
</body>
</html>

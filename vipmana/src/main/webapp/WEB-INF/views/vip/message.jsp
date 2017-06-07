<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/6/7
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>消息提示</title>
</head>
<body>
<%--弹出操作反馈消息 5秒后自动刷新页面--%>
<h2>结果:<strong>${message}</strong></h2>
<h4>5秒后页面自动关闭</h4>
</body>
<script>
    setTimeout("window.close()", 5000);
</script>
</html>

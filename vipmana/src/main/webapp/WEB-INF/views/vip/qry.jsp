<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/30
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <strong>${mess}</strong>
    <form method="post" action="${pageContext.request.contextPath}/vip/qry.do">
        <label>VIP:<input name="vcode" autofocus></label>
        <input type="submit" value="Query">
    </form>
    <main>
        <c:if test="${v!=null}">
            <table>
                <thead>
                    <td>编号</td>
                    <td>VIP等级</td>
                    <td>姓名</td>
                    <td>性别</td>
                </thead>
                <tbody>
                    <td>${v.vcode}</td>
                    <td>${v.rank}</td>
                    <td>${v.name}</td>
                    <td>${v.age}</td>
                </tbody>
            </table>
        </c:if>
    </main>
</body>
</html>

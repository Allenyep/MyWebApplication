<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/6/6
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Material Design Bootstrap -->
    <link href="${pageContext.request.contextPath}/static/css/mdb.min.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">
</head>
<body>
<section>
    <article>
        <form id="form1" name="form1" method="post" action=""
              class="form-inline form-group form-align">
            <input type="input" name="suserName" id="suserName"
                   placeholder="请输入关键字!" class="form-control input-sm input-size "/>
            <input type="submit" name="submit" value="查 询" class="btn btn-sm btn-warning "/>
            <input type="button" value="新增标签" class="btn btn-primary btn-sm" onclick="deletedLabel()">
        </form>
    </article>
    <form id="form2" name="form2" method="post" action="">
        <table class="table table-striped table-hover">
            <thead class="thead-inverse">
            <tr>
                <th><input type="checkbox" id="idAll"></th>
                <th>名称</th>
                <th>网址</th>
                <th>修改</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="attr" items="${attrsList}">
                <tr>
                    <c:if test="${attr!=null}">
                        <td><input type="checkbox" name="ids" value=""></td>
                        <td>${attr.attrName}</td>
                        <td><a href="${attr.attrURL}" target="_blank">${attr.attrURL}</a></td>
                        <td><a href="${pageContext.request.contextPath}!" class="list-group-item">
                            修改</a></td>
                        <td><a href="${pageContext.request.contextPath}!" class="list-group-item">
                            删除</a></td>
                    </c:if>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </form>
    <P class="btn-container">
    <form method="post" action="${pageContext.request.contextPath}/userLabelDelete.do">
        <input type="hidden" name="labelId" value="${labelId}">
        <input type="submit" value="删除栏目" class="btn btn-danger btn-sm">
    </form>
    </P>

</section>
</body>
<!-- JQuery -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-2.2.3.min.js"></script>

<!-- Bootstrap tooltips -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/tether.min.js"></script>

<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>

<!-- MDB core JavaScript -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/mdb.min.js"></script>

<script>

    function addAttr() {

    }
</script>
</html>

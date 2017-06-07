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
    <title>添加标签</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Material Design Bootstrap -->
    <link href="${pageContext.request.contextPath}/static/css/mdb.min.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">
</head>
<body>
<div class="card">
    <div class="card-block">
        <p><strong>添加标签</strong></p>
        <p>添加你所需要的标签</p>
        <form action="${pageContext.request.contextPath}/userattradd.do" method="post">
            <div class="md-form">
                <i class="fa fa-user prefix"></i>
                <input type="text" id="form1" name="attrName" class="form-control">
                <label for="form1">标签名称</label>
            </div>
            <div class="md-form">
                <i class="fa fa-envelope prefix"></i>
                <input type="text" id="form2" name="attrURL" class="form-control">
                <label for="form2">标签地址</label>
            </div>
            <button type="submit" class="btn btn-default">添 加</button>
        </form>
    </div>
</div>
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
    //[a-zA-z]+://[^\s]*
    $('#form2').blur(function (){
        var URL=$('#form2').val();
        if(URL!=""){
            var rag="[a-zA-z]+://[^\\s]*";
            if(!reg.match(URL)){
                alert("填写的网址有误，可能是没加上HTTP前缀，请重新填写");
            }
        }
    });
</script>
</html>

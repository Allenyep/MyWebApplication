<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/10
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>主页</title>
    <style>
        menu,h1,ul{
            margin: 0;
        }
        html,body{
            margin:0;
            height:100%;
        }
        body>header{
            line-height: 80px;
            text-align: center;
            background: #66afe9;
        }
        body>header>h1{
            display: inline;
            text-align: center;
        }
        .body{
            position: absolute;
            top:80px;
            bottom: 0;
            width:100%;
        }
        .body>menu{
            position: absolute;
            left:0;
            width:200px;
            height:100%;
            border:1px solid black;
            box-sizing: border-box;
        }
        .body>main{
            padding-left:200px;
            height:100%;
        }
        main>iframe{
            height:100%;
            width:100%;
            border: 0;
            display: block;
        }
        section{
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <header>
        <h1>商场VIP消费查询</h1>
        <span>
            <b>${sessionScope.currentUser.name}</b>
            <a href="${pageContext.request.contextPath}/logout.do">退出登录</a>
        </span>
    </header>
    <section class="body">
        <menu>
            <ul>
                <li>
                    <a href="${pageContext.request.contextPath}/vip/qry.do" target="mainFrame">VIP客户查询</a>
                </li>
                <li>
                    <a href="vip/add.do" target="mainFrame">录入VIP客户</a>
                </li>
                <li>
                    <a href="#">VIP客户管理</a>
                </li>
                <li>
                    <a href="#">VIP客户查询消费</a>
                </li>
                <li>
                    <a href="#">录入VIP客户消费</a>
                </li>
                <li>
                    <a href="#">VIP客户消费管理</a>
                </li>
                <li>
                    <a href="updatepassword.do" target="mainFrame">修改密码</a>
                </li>
            </ul>
        </menu>
        <main>
            <iframe name="mainFrame" src="${pageContext.request.contextPath}/welcome.do"></iframe>
        </main>
    </section>


</body>
</html>

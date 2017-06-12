<%@page pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="baidu-site-verification" content="9ipcwwSHSK" />
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <link rel="shortcut icon" href="static/img/myicon.ico">
    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?dc8a71d5824cb3cce7b9efa7c9db1063";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>

    <script>
        if(window.top!=window){
            window.top.location.href=window.location.href;
        }
    </script>

    <title>登 录-Allen</title>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

    <!-- Bootstrap core CSS -->
    <link href="static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Material Design Bootstrap -->
    <link href="static/css/mdb.min.css" rel="stylesheet">

    <!-- Your custom styles (optional) -->
    <link href="static/css/style.css" rel="stylesheet">

    <!-- Dropdown.css -->
    <link rel="stylesheet" type="text/css" href="static/css/jquery.dropdown.css">
</head>
<body>
    <h2>Login</h2>

    <div style="height: 260px;margin: 0 auto;">
        <!-- login-box -->
        <div class="login-mask " style="display: none;width: 100%; height: 950px;background:#000;opacity: 0.5; position: fixed; z-index: 10;"></div>
        <div class="login-box col-lg-4 container">
            <!--Form with header-->
            <div class="card">
                <div class="card-block ">

                    <!--Header-->
                    <div class="form-header  purple darken-4">
                        <h3><i class="fa fa-lock"></i> 登 录:</h3>
                        <h5>${message}</h5>
                        <%--<a href="#" class="close">X</a>--%>
                    </div>


                    <!--Body-->
                    <form id="loginForm" action="${pageContext.request.contextPath}/login.do" method="post">
                        <div class="md-form">
                            <i class="fa fa-envelope prefix"></i>
                            <input type="text" id="account" name="account" class="form-control">
                            <label for="account" class="active">账号</label>
                        </div>

                        <div class="md-form">
                            <i class="fa fa-lock prefix"></i>
                            <input type="password" id="password" name="password" class="form-control">
                            <label for="password">密码</label>
                        </div>

                        <div class="text-center">
                            <%
                                //TODO: 异步登录
                            %>
                            <button class="btn btn-deep-purple btn-login" type="submit">登录</button>
                        </div>
                    </form>

                </div>

                <!--Footer-->
                <div class="modal-footer">
                    <div class="options">
                        <p>没有账号? <a href="javascript:;" class="btn-register">注册</a></p>
                        <p>忘记 <a href="javascript:;" class="btn-forgetpwd">密码?</a></p>
                        <p>返回 <a href="javascript:;" onclick="location='${pageContext.request.contextPath}/index.jsp'" class="btn-forgetpwd">首页</a></p>
                    </div>
                </div>

            </div>
            <!--/Form with header-->
        </div>
        <%--注册--%>
        <div class="register-box col-lg-4 container" style="display: none;">

            <!--Form with header-->
            <div class="card">
                <div class="card-block">

                    <!--Header-->
                    <div class="form-header blue-gradient">
                        <h3><i class="fa fa-user"></i> 注 册:</h3>
                        <h5>${message}</h5>
                        <a href="#" class="close">X</a>
                    </div>
                    <!--Body-->
                    <form action="${pageContext.request.contextPath}/register.do" method="post">
                    <div class="md-form">
                        <i class="fa fa-user prefix"></i>
                        <input type="text" id="registername" name="name"  class="form-control">
                        <label for="registername">你的昵称</label>
                    </div>
                    <div class="md-form">
                        <i class="fa fa-envelope prefix"></i>
                        <input type="email" id="registermail" name="account"  class="form-control">
                        <label for="registermail">你的邮箱</label>
                    </div>

                    <div class="md-form">
                        <i class="fa fa-lock prefix"></i>
                        <input type="password" id="registerpassword" name="password" class="form-control">
                        <label for="registerpassword">你的密码</label>
                    </div>

                    <div class="md-form">
                        <i class="fa fa-lock prefix"></i>
                        <input type="password" id="registerpasswordcomfirm" name="passwordConfirm"  class="form-control">
                        <label for="registerpasswordcomfirm">确认密码</label>
                    </div>

                    <div class="md-form">
                        <i class="fa fa-lock prefix"></i>
                        <input type="password" id="registervalidate" class="form-control">
                        <label for="registervalidate"><img name="imgvalidate" url="${pageContext.request.contextPath}/imgvali.do"/></label>
                    </div>
                    <%
                        //TODO 加一个注册验证码！！！
                    %>
                    <div class="text-center">
                        <button class="btn btn-indigo" type="submit">注 册</button>
                        <hr>
                        <fieldset class="form-group">
                            <input type="checkbox" id="checkbox1">
                            <label for="checkbox1">Subscribe me to the newsletter</label>
                        </fieldset>
                    </div>
            </form>
                </div>
            </div>
            <!--/Form with header-->
        </div>
    </div>

</body>
<%--JS--%>
<!-- JQuery -->
<script type="text/javascript" src="static/js/jquery-2.2.3.min.js"></script>

<!-- Bootstrap tooltips -->
<script type="text/javascript" src="static/js/tether.min.js"></script>

<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="static/js/bootstrap.min.js"></script>

<!-- MDB core JavaScript -->
<script type="text/javascript" src="static/js/mdb.min.js"></script>

<!-- doropdown.js -->
<script type="text/javascript" src="static/js/jquery.dropdown.js"></script>


<!-- 粒子特效 -->
<script type="text/javascript" src="static/js/canvas-particle.js"></script>

<script type="text/javascript">
    $(document).ready(function() {
        //调用背景特效脚本
        //配置
        var config = {
            vx: 4,
            vy:  4,
            height: 2,
            width: 2,
            count: 100,
            color: "0, 255, 185",
            stroke: "0,0,0",
            dist: 6000,
            e_dist: 20000,
            max_conn: 10
        }
        //调用
        CanvasParticle(config);
    });

    $('.close').click(function() {
//        $('.login-mask').hide();
        $('.login-box').slideDown(200);
        $('.register-box').slideUp(200);
    });

    $('.btn-register').click(function() {
        $('.login-box').slideUp(200);
        $('.register-box').slideDown(200);
    });
</script>
</html>

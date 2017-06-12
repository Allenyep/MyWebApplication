<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: allen
  Date: 2017/5/25
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="baidu-site-verification" content="9ipcwwSHSK"/>
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/myicon.ico">
    <script>
        var _hmt = _hmt || [];
        (function () {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?dc8a71d5824cb3cce7b9efa7c9db1063";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>

    <title>导 航 -Allen</title>


    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Material Design Bootstrap -->
    <link href="${pageContext.request.contextPath}/static/css/mdb.min.css" rel="stylesheet">

    <!-- Your custom styles (optional) -->
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">

    <!-- Dropdown.css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/jquery.dropdown.css">

    <!-- Template styles -->
    <style rel="stylesheet">
        /* TEMPLATE STYLES */
        /* Necessary for full page carousel*/

        html,
        body {
            height: 100%;
        }

        /* Navigation*/

        .navbar {
            background-color: transparent;
        }

        .top-nav-collapse {
            background-color: #304a74;
        }

        footer.page-footer {
            background-color: #304a74;
        }

        @media only screen and (max-width: 768px) {
            .navbar {
                background-color: #4285F4;
            }
        }

        .scrolling-navbar {
            -webkit-transition: background .5s ease-in-out, padding .5s ease-in-out;
            -moz-transition: background .5s ease-in-out, padding .5s ease-in-out;
            transition: background .5s ease-in-out, padding .5s ease-in-out;
        }

        /* Carousel*/

        .carousel {
            height: 110%;
        }

        @media (max-width: 776px) {
            .carousel {
                height: 100%;
            }
        }

        .carousel-item,
        .active {
            height: 100%;
        }

        .carousel-inner {
            height: 90%;
        }

        /*Caption*/

        .flex-center {
            color: #fff;
        }

        .seabox {
            min-width: 180px;
        }


    </style>

</head>

<body>


<!--Navbar-->
<nav class="navbar navbar-toggleable-md navbar-dark fixed-top scrolling-navbar">
    <div class="container">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                data-target="#navbarNav1" aria-controls="navbarNav1" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="#">
            <strong><i class="fa fa-send" aria-hidden="true"></i> Yep导航</strong>
        </a>
        <div class="collapse navbar-collapse" id="navbarNav1">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link"><i class="fa fa-search" aria-hidden="true"></i>搜索 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="visitor.jsp"><i class="fa fa-user" aria-hidden="true"></i>访客</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link"><i class="fa fa-heart" aria-hidden="true"></i>支持</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://github.com/Allenyep/SearchPage"><i class="fa fa-github"
                                                                                         aria-hidden="true"></i>github</a>
                </li>
            </ul>
            <div class="d-inline">
                <!-- <input class="form-control" type="text" placeholder="Search"> -->
                <ul class="navbar-nav mr-auto" style="float: right;">
                    <li class="nav-item">
                        <a class="nav-link" href="#container"><i class="fa fa-list-alt" aria-hidden="true"></i>快速链接</a>
                    </li>
                    <li class="nav-item dropdown btn-group">
                        <a class="nav-link dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false"><i class="fa fa-plug"
                                                                         aria-hidden="true"></i>${sessionScope.currentUser.name}
                        </a>
                        <div class="dropdown-menu dropdown" aria-labelledby="dropdownMenu1">
                            <a class="dropdown-item"
                               onclick="location='${pageContext.request.contextPath}/vip/usermain.do'"><i
                                    class="fa fa-pause-circle" aria-hidden="true"></i>个人中心</a>
                            <a class="dropdown-item" href="javascript:;"
                               onclick="if(confirm('是否退出')==true)location='${pageContext.request.contextPath}/logout.do'"><i
                                    class="fa fa-pause-circle" aria-hidden="true"></i>退出</a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>
<!--/.Navbar-->


<!--Carousel Wrapper-->
<div id="carousel-example-3" class="carousel slide carousel-fade white-text" data-ride="carousel" data-interval="false">

    <!--Slides-->
    <div class="carousel-inner" role="listbox">

        <!-- First slide -->
        <div id="backgroundurl" class="carousel-item active view hm-black-light"
             style=" background-repeat: no-repeat; background-size: cover;">

            <!-- Caption -->
            <div class="full-bg-img flex-center ">
                <ul class="animated fadeInUp col-md-12">
                    <li>
                        <h1 class="h1-responsive " style="font-size: 3rem"><i class="fa fa-send" aria-hidden="true"></i>
                            Yep导 航</h1></li>
                    <li>
                        <p>Best places you should see, traditional dishes that you have to try</p>
                    </li>
                    <li>
                        <form action="http://www.baidu.com/baidu" target="_blank" id="SearchForm">
                            <div class="md-form input-group" style="width: 60%; margin: 0 auto; ">
                                <div class="input-group">
                                    <input name="tn" type="HIDDEN" value="baidu">
                                    <i class="fa fa-search fa-2x" style="margin-top: 10px;" aria-hidden="true"></i>
                                    <input type="text" name="word" class="form-control seabox" placeholder="想看什么see一下"
                                           id="SearchContent" baiduSug="1" style="background: white;border-radius:6px;">
                                    <select class="md-select" id="SearchSelect">
                                        <option value="baidu" selected class="rounded-circle">百度</option>
                                        <option value="zhihu" class="rounded-circle">知乎</option>
                                        <option value="wangpan" class="rounded-circle">百度网盘</option>
                                        <option value="weibo" class="rounded-circle">微博</option>
                                        <option value="icon" class="rounded-circle">Icon</option>
                                        <option value="github" class="rounded-circle">github</option>
                                        <option value="google" class="rounded-circle">google</option>
                                    </select>
                                </div>
                            </div>
                            <a href="javascript:;" class="btn btn-info btn-lg" onclick="SearchSee()"> See!</a>
                        </form>
                        <script charset="gbk" src="http://www.baidu.com/js/opensug.js"></script>
                    </li>
                </ul>
            </div>
            <!-- /.Caption -->

        </div>
        <!--/.First slide-->
    </div>
    <!--/.Slides-->
</div>
<!--/.Carousel Wrapper-->

<br>

<!--Content-->
<div class="container">
    <div class="row">
        <c:forEach var="label" items="${labels}">
            <c:if test="${label!=null}">
                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-block">
                            <h4 class="card-title text-center"><c:out value="${label.labelName}"/></h4>
                            <c:forEach var="attr" items="${attrs}">
                                <c:if test="${attr.labelId==label.labelId}">
                                    <a class="btn ${label.labelColoruse} btn-sm btn-rounded waves-effect" target="_blank"
                                       href="${attr.attrURL}"><strong><c:out value="${attr.attrName}"/></strong></a>
                                </c:if>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </c:if>
        </c:forEach>

    </div>
</div>
<!--/.Content-->


<!--Footer-->
<footer class="page-footer center-on-small-only">

    <!--Footer Links-->
    <div class="container-fluid">
        <div class="row">

            <!--First column-->
            <div class="col-lg-3 offset-lg-1 hidden-lg-down">
                <h5 class="title">关于 MATERIAL DESIGN</h5>
                <p>Material Design (codenamed Quantum Paper) 是由谷歌开发的一种设计语言。 </p>

                <p>Material Design for Bootstrap (MDB) 是一套基于Bootstrap的强大的 Material Design UI 设计包</p>
            </div>
            <!--/.First column-->

            <hr class="hidden-md-up">

            <!--Second column-->
            <div class="col-lg-2 col-md-4 offset-lg-1">
                <h5 class="title">Yep导航</h5>
                <p>此页面由Allenyep制作</p>
                <p>参考自<a href="#!">北邮人导航</a></p>
            </div>
            <!--/.Second column-->

            <hr class="hidden-md-up">

            <!--Third column-->
            <div class="col-lg-2 col-md-4">
                <h5 class="title">友情链接</h5>
                <ul>
                    <li><a href="http://tanjianff.cn/" target="_blank">Tanjianff.cn</a></li>
                    <li><a href="http://angryfu.cn/" target="_blank">angryfu.cn</a></li>
                </ul>
            </div>
            <!--/.Third column-->

            <hr class="hidden-md-up">

            <!--Fourth column-->
            <div class="col-lg-2 col-md-4">
                <h5 class="title">Follow me on</h5>
                <ul>
                    <li><a href="#!">Facebook</a></li>
                    <li><a href="#!">Instagram</a></li>
                    <li><a href="#!">Twitter</a></li>
                    <li><a href="#!">Pinterest</a></li>
                </ul>
            </div>
            <!--/.Fourth column-->

        </div>
    </div>
    <!--/.Footer Links-->

    <hr>


    <!--Copyright-->
    <div class="footer-copyright">
        <div class="container-fluid">
            © 2017 Copyright: <a href="http://www.MDBootstrap.com"> MDBootstrap.com </a>Designed by Allenyep

        </div>
    </div>
    <!--/.Copyright-->

</footer>
<!--/.Footer-->


<!-- SCRIPTS -->

<!-- JQuery -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-2.2.3.min.js"></script>

<!-- Bootstrap tooltips -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/tether.min.js"></script>

<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>

<!-- MDB core JavaScript -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/mdb.min.js"></script>

<!-- doropdown.js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.dropdown.js"></script>

<!-- 百度搜索提示 -->
<script charset="gbk" src="http://www.baidu.com/js/opensug.js"></script>

<!-- 粒子特效 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/canvas-particle.js"></script>

<script type="text/javascript">
    // Material Select Initialization
    // $.material.init();

    $(document).ready(function () {
        var randomnum = Math.random() * 16 + 1;
        randomnum = Math.floor(randomnum);
        var avatar = $("#backgroundurl").css("backgroundImage");
        console.log(avatar);
        // url("file:///C:/Users/allen/Desktop/PanSearchTest/half-page-carousel/yepnavi/img/background/10.jpg")
        var newurl = "url(\"static/img/background/" + randomnum + ".jpg\")";
        // alert(newurl);
        $("#backgroundurl").css("background", newurl);

        //调用背景特效脚本
        //配置
        var config = {
            vx: 4,
            vy: 4,
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

    $().dropdown({autoinit: "select"});
    $('#SearchContent').bind('keypress', function (event) {
        if (event.keyCode == 13) {
            SearchSee();
        }
    });

    function SearchSee() {
        var seaForm = $('#SearchForm');
        var searchSelect = $('#SearchSelect').val();
        var seaContent = $('#SearchContent').val();
        var url;
        // alert(seaContent);
        switch (searchSelect) {
            case 'baidu':
                url = "http://www.baidu.com/s?wd=";
                // window.open("http://www.baidu.com/s?wd="+seaContent);
                break;
            case 'zhihu':
                url = "https://www.zhihu.com/search?type=content&q=";
                break;
            case 'icon':
                url = "http://www.easyicon.net/iconsearch/";
                break;
            case 'github':
                url = "https://github.com/search?utf8=%E2%9C%93&q=";
                break;
            case 'wangpan':
                url = "http://www.sobaidupan.com/search.asp?wd=";
                break;
            case 'weibo':
                url = "http://s.weibo.com/weibo/";
                break;
            case 'google':
                url = "https://www.google.com.hk/webhp?hl=zh-CN&sa=X&ved=0ahUKEwiUjI7PxtXSAhUKwrwKHdbRCVIQPAgD#safe=strict&hl=zh-CN&*&q="
        }
        window.open(url + seaContent);
    }

</script>
</body>

</html>

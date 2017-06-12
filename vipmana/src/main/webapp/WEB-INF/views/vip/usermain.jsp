<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <title>个人页面</title>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Material Design Bootstrap -->
    <link href="${pageContext.request.contextPath}/static/css/mdb.min.css" rel="stylesheet">
    
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">
 
    <!-- Template styles -->
    <style rel="stylesheet">
        /* TEMPLATE STYLES */
        
        main {
            padding-top: 3rem;
            padding-bottom: 2rem;
        }
        
        .widget-wrapper {
            padding-bottom: 2rem;
            border-bottom: 1px solid #e0e0e0;
            margin-bottom: 2rem;
        }
        
        .extra-margins {
            margin-top: 1rem;
            margin-bottom: 2.5rem;
        }
        
        .divider-new {
            margin-top: 0;
        }
        
          .navbar {
            background-color: #414a5c;
        }
        
        footer.page-footer {
            background-color: #414a5c;
            margin-top: 2rem;
        }
    </style>
</head>

<body>


    <header>

        <!--Navbar-->
        <nav class="navbar navbar-toggleable-md navbar-dark">
            <div class="container">
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNav1" aria-controls="navbarNav1" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <strong>个人页面</strong>
                </a>
                <div class="collapse navbar-collapse" id="navbarNav1">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link">${sessionScope.currentUser.name} <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" onclick="location='${pageContext.request.contextPath}/userindex.do'">返回首页</a>
                        </li>
                        <li class="nav-item">
                            <%
                                //TODO:个人信息页面
                            %>
                            <a class="nav-link">个人信息</a>
                        </li>
                        <li class="nav-item dropdown btn-group">
                            <a class="nav-link dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                            <div class="dropdown-menu dropdown" aria-labelledby="dropdownMenu1">
                                <a class="dropdown-item">Action</a>
                                <a class="dropdown-item">Another action</a>
                                <a class="dropdown-item">Something else here</a>
                            </div>
                        </li>
                    </ul>
                    <form class="form-inline waves-effect waves-light">
                        <input class="form-control" type="text" placeholder="Search">
                    </form>
                </div>
            </div>
        </nav>
	    <!--/.Navbar-->

    </header>

    <main>

        <!--Main layout-->
        <div class="container">
            <div class="row">

                <!--Sidebar-->
                <div class="col-lg-4 wow fadeIn" data-wow-delay="0.2s">


                    <div class="widget-wrapper">
                        <h4>栏目:</h4>
                        <strong>${message}</strong>
                        <br>
                        <div class="list-group menu">
                            <c:forEach var="label" items="${labels}">
                                <c:if test="${label!=null}">
                                <a href="${pageContext.request.contextPath}/usermainattrs.do?labelId=${label.labelId}" target="attrFrame"
                                   class="list-group-item"><c:out value="${label.labelName}"/></a>
                                </c:if>
                            </c:forEach>
                        </div>
                    </div>

                    <div class="widget-wrapper wow fadeIn" data-wow-delay="0.4s">
                        <h4>添加一个栏目:</h4>
                        <br>
                        <div class="card">
                            <div class="card-block">
                                <p><strong>添加栏目</strong></p>
                                <p>添加你所需要的标签</p>
                                <form action="${pageContext.request.contextPath}/userLabelInsert.do" method="post">
                                    <div class="md-form">
                                        <i class="fa fa-user prefix"></i>
                                        <input type="text" id="form1" name="labelName" class="form-control">
                                        <label for="form1">栏目名称</label>
                                    </div>
                                    <%--<div class="md-form">
                                        <i class="fa fa-envelope prefix"></i>
                                        <input type="text" id="form2" name="labelColor" class="form-control">
                                        <label for="form2">栏目颜色</label>
                                    </div>--%>
                                    <button type="submit" class="btn btn-default">添 加</button>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
                <!--/.Sidebar-->

                <!--Main column-->
                <div class="col-lg-8">

                    <!--First row-->
                    <div class="row wow fadeIn" data-wow-delay="0.4s">
                        <div class="col-lg-12">
                            <div class="divider-new">
                                <h2 class="h2-responsive">调整你的栏目标签</h2>
                            </div>
                            
                            
                            
                            <!--Carousel Wrapper-->
                            <div id="carousel-example-1z" class="carousel slide carousel-fade" data-ride="carousel">
                                <!--Slides-->
                                <div class="carousel-inner" role="listbox">
                                    <!--First slide-->
                                    <div class="carousel-item active">
                                        <iframe id="attrFrame" frameborder="no" name="attrFrame" style="width: 100%;height: 550px;"
                                                src="http://oolhqclj2.bkt.clouddn.com/ablum.jpg" ></iframe>
                                    </div>
                                    <!--/First slide-->
                                </div>
                                <!--/.Slides-->

                            </div>
                            <!--/.Carousel Wrapper-->
                        </div>
                    </div>
                    <!--/.First row-->
                    <br>
                    <hr class="extra-margins">

                    <!--Second row-->
                    <div class="row">
                        <!--First columnn-->
                        <div class="col-lg-4">
                            <!--Card-->
                            <div class="card  wow fadeIn" data-wow-delay="0.2s">

                                <!--Card image-->
                                <div class="view overlay hm-white-slight">
                                    <img src="http://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/img%20(32).jpg" class="img-fluid" alt="">
                                    <a href="#">
                                        <div class="mask"></div>
                                    </a>
                                </div>
                                <!--/.Card image-->

                                <!--Card content-->
                                <div class="card-block">
                                    <!--Title-->
                                    <h4 class="card-title">Product title</h4>
                                    <!--Text-->
                                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. </p>
                                    <a href="#" class="btn btn-default">Buy now for <strong>10$</strong></a>
                                </div>
                                <!--/.Card content-->

                            </div>
                            <!--/.Card-->
                        </div>
                        <!--First columnn-->

                        <!--Second columnn-->
                        <div class="col-lg-4">
                            <!--Card-->
                            <div class="card  wow fadeIn" data-wow-delay="0.4s">

                                <!--Card image-->
                                <div class="view overlay hm-white-slight">
                                    <img src="http://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/img%20(38).jpg" class="img-fluid">
                                    <a href="#">
                                        <div class="mask"></div>
                                    </a>
                                </div>
                                <!--/.Card image-->

                                <!--Card content-->
                                <div class="card-block">
                                    <!--Title-->
                                    <h4 class="card-title">Product title</h4>
                                    <!--Text-->
                                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. </p>
                                    <a href="#" class="btn btn-default">Buy now for <strong>30$</strong></a>
                                </div>
                                <!--/.Card content-->

                            </div>
                            <!--/.Card-->
                        </div>
                        <!--Second columnn-->

                        <!--Third columnn-->
                        <div class="col-lg-4">
                            <!--Card-->
                            <div class="card  wow fadeIn" data-wow-delay="0.6s">

                                <!--Card image-->
                                <div class="view overlay hm-white-slight">
                                    <img src="http://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/img%20(1).jpg" class="img-fluid" alt="">
                                    <a href="#">
                                        <div class="mask"></div>
                                    </a>
                                </div>
                                <!--/.Card image-->

                                <!--Card content-->
                                <div class="card-block">
                                    <!--Title-->
                                    <h4 class="card-title">Product title</h4>
                                    <!--Text-->
                                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. </p>
                                    <a href="#" class="btn btn-default">Buy now for <strong>20$</strong></a>
                                </div>
                                <!--/.Card content-->

                            </div>
                            <!--/.Card-->
                        </div>
                        <!--Third columnn-->
                    </div>
                    <!--/.Second row-->

                </div>
                <!--/.Main column-->

            </div>
        </div>
        <!--/.Main layout-->

    </main>

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
    
    <script>
    new WOW().init();

    $(function(){
        $(".menu a").click(function(){
            $(this).addClass("active").siblings().removeClass("active");
        });
    });
    </script>

</body>

</html>
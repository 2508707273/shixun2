<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    session.getAttribute("categories");
    session.getAttribute("product");
    %>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sufee Admin - HTML5 Admin Template</title>
    <meta name="description" content="Sufee Admin - HTML5 Admin Template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="apple-icon.png">
    <link rel="shortcut icon" href="favicon.ico">


    <link rel="stylesheet" href="vendors/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/bootstrap/dist/css/bootstrap-datetimepicker.css">
    <link rel="stylesheet" href="vendors/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="vendors/themify-icons/css/themify-icons.css">
    <link rel="stylesheet" href="vendors/flag-icon-css/css/flag-icon.min.css">


    <link rel="stylesheet" href="assets/css/style.css">

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>


    <style>
        #editor {
            height: 340px;
            border: 1px solid #ccc;
        }

        div[contenteditable="true"] {
            cursor: text
        }
    </style>
</head>

<body>
    <!-- Left Panel -->

    <aside id="left-panel" class="left-panel">
        <nav class="navbar navbar-expand-sm navbar-default">

            <div class="navbar-header">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main-menu"
                    aria-controls="main-menu" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="./"><img src="images/logo.png" alt="Logo"></a>
                <a class="navbar-brand hidden" href="./"><img src="images/logo2.png" alt="Logo"></a>
            </div>

            <div id="main-menu" class="main-menu collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="index.html"> <i class="menu-icon fa fa-dashboard"></i>Dashboard </a>
                    </li>
                    <h3 class="menu-title">表管理</h3><!-- /.menu-title -->
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false"> <i class="menu-icon fa fa-table"></i>产品</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-table"></i><a href="product">产品管理1</a></li>
                            <li><i class="fa fa-table"></i><a href="product_page?currentPage=1&pageSize=5">产品管理2</a>
                            </li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false"> <i class="menu-icon fa fa-table"></i>用户管理</a>
                        <ul class="sub-menu children dropdown-menu">
                            <li><i class="fa fa-table"></i><a href="manager">用户管理</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </aside><!-- /#left-panel -->

    <!-- Left Panel -->

    <!-- Right Panel -->

    <div id="right-panel" class="right-panel">

        <!-- Header-->
        <header id="header" class="header">

            <div class="header-menu">

                <div class="col-sm-7">
                    <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks"></i></a>
                    <div class="header-left">
                        <button class="search-trigger"><i class="fa fa-search"></i></button>
                        <div class="form-inline">
                            <form class="search-form">
                                <input class="form-control mr-sm-2" type="text" placeholder="Search ..."
                                    aria-label="Search">
                                <button class="search-close" type="submit"><i class="fa fa-close"></i></button>
                            </form>
                        </div>

                        <div class="dropdown for-notification">
                            <button class="btn btn-secondary dropdown-toggle" type="button" id="notification"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fa fa-bell"></i>
                                <span class="count bg-danger">5</span>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="notification">
                                <p class="red">You have 3 Notification</p>
                                <a class="dropdown-item media bg-flat-color-1" href="#">
                                    <i class="fa fa-check"></i>
                                    <p>Server #1 overloaded.</p>
                                </a>
                                <a class="dropdown-item media bg-flat-color-4" href="#">
                                    <i class="fa fa-info"></i>
                                    <p>Server #2 overloaded.</p>
                                </a>
                                <a class="dropdown-item media bg-flat-color-5" href="#">
                                    <i class="fa fa-warning"></i>
                                    <p>Server #3 overloaded.</p>
                                </a>
                            </div>
                        </div>

                        <div class="dropdown for-message">
                            <button class="btn btn-secondary dropdown-toggle" type="button" id="message"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="ti-email"></i>
                                <span class="count bg-primary">9</span>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="message">
                                <p class="red">You have 4 Mails</p>
                                <a class="dropdown-item media bg-flat-color-1" href="#">
                                    <span class="photo media-left"><img alt="avatar" src="images/avatar/1.jpg"></span>
                                    <span class="message media-body">
                                        <span class="name float-left">Jonathan Smith</span>
                                        <span class="time float-right">Just now</span>
                                        <p>Hello, this is an example msg</p>
                                    </span>
                                </a>
                                <a class="dropdown-item media bg-flat-color-4" href="#">
                                    <span class="photo media-left"><img alt="avatar" src="images/avatar/2.jpg"></span>
                                    <span class="message media-body">
                                        <span class="name float-left">Jack Sanders</span>
                                        <span class="time float-right">5 minutes ago</span>
                                        <p>Lorem ipsum dolor sit amet, consectetur</p>
                                    </span>
                                </a>
                                <a class="dropdown-item media bg-flat-color-5" href="#">
                                    <span class="photo media-left"><img alt="avatar" src="images/avatar/3.jpg"></span>
                                    <span class="message media-body">
                                        <span class="name float-left">Cheryl Wheeler</span>
                                        <span class="time float-right">10 minutes ago</span>
                                        <p>Hello, this is an example msg</p>
                                    </span>
                                </a>
                                <a class="dropdown-item media bg-flat-color-3" href="#">
                                    <span class="photo media-left"><img alt="avatar" src="images/avatar/4.jpg"></span>
                                    <span class="message media-body">
                                        <span class="name float-left">Rachel Santos</span>
                                        <span class="time float-right">15 minutes ago</span>
                                        <p>Lorem ipsum dolor sit amet, consectetur</p>
                                    </span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-sm-5">
                    <div class="user-area dropdown float-right">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false">
                            <img class="user-avatar rounded-circle" src="images/admin.jpg" alt="User Avatar">
                        </a>

                        <div class="user-menu dropdown-menu">
                            <a class="nav-link" href="#"><i class="fa fa-user"></i> My Profile</a>

                            <a class="nav-link" href="#"><i class="fa fa-user"></i> Notifications <span
                                    class="count">13</span></a>

                            <a class="nav-link" href="#"><i class="fa fa-cog"></i> Settings</a>

                            <a class="nav-link" href="#"><i class="fa fa-power-off"></i> Logout</a>
                        </div>
                    </div>

                    <div class="language-select dropdown" id="language-select">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown" id="language" aria-haspopup="true"
                            aria-expanded="true">
                            <i class="flag-icon flag-icon-us"></i>
                        </a>
                        <div class="dropdown-menu" aria-labelledby="language">
                            <div class="dropdown-item">
                                <span class="flag-icon flag-icon-fr"></span>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-es"></i>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-us"></i>
                            </div>
                            <div class="dropdown-item">
                                <i class="flag-icon flag-icon-it"></i>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

        </header><!-- /header -->
        <!-- Header-->

        <div class="breadcrumbs">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Dashboard</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                    <div class="page-title">
                        <ol class="breadcrumb text-right">
                            <li><a href="#">Dashboard</a></li>
                            <li><a href="#">Forms</a></li>
                            <li class="active">Basic</li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>

        <div class="content mt-3">
            <div class="animated fadeIn">


                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-header">
                                <strong>产品信息</strong>
                                <button type="button" style="float:right" onclick="javascrtpt:window.location.href='product_page?currentPage=1&pageSize=5'" class="btn btn-primary">返回</button>
                                
                            </div>
                            <div class="card-body card-block">
                                <form action="" method="post" name="form1" enctype="multipart/form-data"
                                    class="form-horizontal">
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">商品编号</label></div>
                                        <div class="col-12 col-md-9">
                                            <p class="form-control-static">${product.id}</p><small
                                                class="form-text text-muted">此项不可修改</small>

                                        </div>
                                    </div>
                                    <input id="PageContext" type="hidden" value="${pageContext.request.contextPath}" />
                                    <input type="hidden" name="product_id" value="${product.id}" />
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">商品名称</label></div>
                                        <div class="col-12 col-md-9"><input type="text" id="text-input"
                                                name="product_name" value=${product.name} class="form-control">
                                            <p class="form-control-static"></p>
                                        </div>
                                    </div>

                                    <div class="row form-group">

                                        <label for="text-input" class=" form-control-label"></label>
                                        <div class="col col-md-3"><label for="select"
                                                class=" form-control-label">分类</label></div>
                                        <div class="col-12 col-md-3">
                                            <select name="select1" id="select1" class="form-control">
                                                <option value="">----请选择----</option>
                                                <c:forEach items="${categories}" var="categories">
                                                    <option value="${categories.id }">${categories.name}</option>
                                                </c:forEach>
                                            </select>
                                            <p class="form-control-static"></p>
                                        </div>
                                        <div class="col-12 col-md-3">
                                            <select name="select2" id="select2" class="form-control">
                                                <option value="">----请选择----</option>
                                            </select>
                                            <p class="form-control-static"></p>
                                        </div>
                                        <div class="col-12 col-md-3">
                                            <select name="select3" id="select3" class="form-control">
                                                <option value="">----请选择----</option>
                                                <option value="${product.cate_id}" selected>${CName} </option>
                                            </select>
                                            <p class="form-control-static"></p>
                                        </div>
                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">库存数量</label></div>
                                        <div class="col col-md-3"><input type="text" id="text-input"
                                                name="product_inventory" value=${product.inventory}
                                                class="form-control">
                                            <p class="form-control-static"></p>
                                        </div>

                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">销售数量</label></div>
                                        <div class="col col-md-3"><input type="text" id="text-input"
                                                name="product_sales_volume" value=${product.sales_volume}
                                                class="form-control">
                                            <p class="form-control-static"></p>
                                        </div>
                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">定价</label></div>
                                        <div class="col col-md-3"><input type="text" id="text-input"
                                                name="product_price" value=${product.price} class="form-control">
                                            <p class="form-control-static"></p>
                                        </div>

                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">售价</label></div>
                                        <div class="col col-md-3"><input type="text" id="text-input"
                                                name="product_sale_price" value=${product.sale_price}
                                                class="form-control">
                                            <p class="form-control-static"></p>
                                        </div>
                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">添加时间</label></div>
                                        <div class="col col-md-3">
                                            <input type="text" class="form-control" name="product_create_time"
                                                id="datetimepicker" value=${product.create_time}>
                                            <p class="form-control-static"></p>
                                        </div>
                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="text-input"
                                                class=" form-control-label">开售时间</label></div>
                                        <div class="col col-md-3">
                                            <input type="text" class="form-control" name="product_sale_time"
                                                id="datetimepicker2" value=${product.sale_time}>
                                            <p class="form-control-static"></p>
                                        </div>
                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="file-input"
                                                class=" form-control-label">上传图片</label></div>
                                        <div class="col-12 col-md-9">
                                                <input type="file" id="file" onchange="btu()" class="form-control-file">
                                            <p class="form-control-static"></p>
                                        </div>

                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="file-input"
                                                class=" form-control-label">商品详情</label></div>
                                        <div class="col col-sm-9">
                                            <div id="editor">
                                                ${product.detail_description }
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row form-group">
                                        <div class="col col-md-3"><label for="file-input"
                                                class=" form-control-label">商品卖点</label></div>
                                        <div class="col col-sm-9">
                                            <div id="editor2">
                                                ${product.selling_description }
                                            </div>
                                        </div>
                                    </div>
                                    <div class="card-footer">
                                        <button type="button" class="btn btn-primary btn-sm" onclick="getContent()">
                                            <i class="fa fa-dot-circle-o"></i> 提交
                                        </button>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div><!-- .animated -->
    </div><!-- .content -->
    </div><!-- /#right-panel -->
    <!-- Right Panel -->

    <script src="vendors/jquery/dist/jquery.min.js"></script>
    <script src="assets/js/main.js"></script>
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="vendors/bootstrap/dist/js/bootstrap-datetimepicker.js"></script>
    <script src="vendors/bootstrap/dist/js/bootstrap-datetimepicker.zh-CN.js"></script>

    <script src="vendors/jquery-validation/dist/jquery.validate.min.js"></script>
    <script type="text/javascript" src="assets/js/wangEditor.min.js"></script>


    <script type="text/javascript">
        window.onload = function () {
            $('#select1').change(function () {
                var id = $(this).children('option:selected').val();
                $.ajax({
                    "url": "./ShowCategory",
                    "type": "POST",
                    "data": { "id": id },
                    dataType: 'json',
                    "success": function (json) {
                        $("#select2").children().not(':eq(0)').remove();
                        $("#select3").children().not(':eq(0)').remove();
                        $.each(json, function (i, list) {
                            $("#select2").append('<option value="' + list.id + '">' + list.name + '</option>');
                        })
                    }
                })
            });
            $('#select2').change(function () {
                var id = $(this).children('option:selected').val();
                $.ajax({
                    "url": "./ShowCategory",
                    "type": "POST",
                    "data": { "id": id },
                    dataType: 'json',
                    "success": function (json) {
                        $("#select3").children().not(':eq(0)').remove();
                        $.each(json, function (i, list) {
                            $("#select3").append('<option value="' + list.id + '">' + list.name + '</option>');
                        })
                    }
                })
            });

            $('#datetimepicker').datetimepicker({
                format: 'yyyy-mm-dd',
                language: "zh-CN",
                todayHighlight: true,
                minView: 2, //最精准的时间选择为日期0-分 1-时 2-日 3-月
                weekStart: 1,
                pickerPosition: "bottom-left",
                todayBtn: true,
                startView: 'year',
                maxView: 'year',
                minView: 'month',
                autoclose: true,
            });
            $('#datetimepicker2').datetimepicker({
                format: 'yyyy-mm-dd',
                language: "zh-CN",
                todayHighlight: true,
                minView: 2, //最精准的时间选择为日期0-分 1-时 2-日 3-月
                weekStart: 1,
                pickerPosition: "bottom-left",
                todayBtn: true,
                startView: 'year',
                maxView: 'year',
                minView: 'month',
                autoclose: true,
            });


        }
    </script>
    <script type="text/javascript">
        var thumbnail = "";
        function btu() {
            var name = $("#name").val();
            var file = $("#file")[0].files[0];//新特性，获取文件对象
            var fordata = new FormData();//新特性，得到formData对象，把获取的值扔进去，相当于map
            fordata.append("name", name);
            fordata.append("file", file);
            console.log(file)
            $.ajax({
            	async:false,
                url: "UpdataFile",
                data: fordata,
                cache: false,
                processData: false, //必须写
                contentType: false, //必须写
                type: "post",
                success: function (data) {
                    thumbnail = data;
                }

            })

        }
        var E = window.wangEditor
        var editor = new E('#editor')
        editor.create()
        var editor2 = new E('#editor2')
        editor2.create()
        function getContent() {

            var text1 = editor.txt.html();
            var text2 = editor2.txt.html();
            var id = form1.product_id.value;
            var name = form1.product_name.value;
            var Cate_id = form1.select3.value;
            var inventory = form1.product_inventory.value;
            var sales_volume = form1.product_sales_volume.value;
            var price = form1.product_price.value;
            var sale_price = form1.product_sale_price.value;
            var create_time = form1.product_create_time.value;
            var sale_time = form1.product_sale_time.value;
            // var pageContext = form1.pageContext.value;
            // alert(pageContext);
            $.ajax({
                "url": "./UpdateProductServlet",
                "type": "POST",
                "data": {
                    "id": id,
                    "name": name,
                    "Cate_id": Cate_id,
                    "thumbnail":thumbnail,
                    "inventory": inventory,
                    "sales_volume": sales_volume,
                    "price": price,
                    "sale_price": sale_price,
                    "create_time": create_time,
                    "sale_time": sale_time,
                    "detail_description": text1,
                    "selling_description": text2
                },
                dataType: 'json',
                success: function (result) {
                    if (result > 0) {
                        alert("更新成功！");
                        window.location.href = "product_page?currentPage=1&pageSize=5"
                    }
                },
                error: function (result) {
                    //失败之后
                }

            })


        }
    </script>

</body>

</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <%--BootStrap美化界面--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>


    <%--<form class="navbar-form navbar-left" role="search">--%>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label>书籍名称：</label>
            <input type="text" name="bookName" class="form-control" placeholder="请填写书籍名称" required>
        </div>
        <br><br>
        <div class="form-group">
            <label>书籍数量：</label>
            <input type="text" name="bookCount" class="form-control" placeholder="请填写书籍数量" required>
        </div>
        <br><br>
        <div class="form-group">
            <label>书籍描述：</label>
            <input type="text" name="detail" class="form-control" placeholder="请填写书籍描述" required>
        </div>
        <br><br>
        <button type="submit" class="btn btn-default">确认添加</button>
    </form>




</div>


</body>
</html>

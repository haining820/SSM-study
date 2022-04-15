<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
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


    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">

        <%--提交修改的sql请求,修改失败,不是事务的问题,最后在sql处发现问题--%>
        <%--前端传递隐藏域--%>
        <input type="hidden" name="bookId" value="${singleBook.bookId}">

        <div class="form-group">
            <label>书籍名称：</label>
            <input type="text" name="bookName" class="form-control" placeholder="请填写书籍名称" value="${singleBook.bookName}" required>
        </div>
        <br><br><br>
        <div class="form-group">
            <label>书籍数量：</label>
            <input type="text" name="bookCount" class="form-control" placeholder="请填写书籍数量" value="${singleBook.bookCount}" required>
        </div>
        <br><br><br>
        <div class="form-group">
            <label>书籍描述：</label>
            <input type="text" name="detail" class="form-control" placeholder="请填写书籍描述" value="${singleBook.detail}" required>
        </div>
        <br><br><br>
        <button type="submit" class="btn btn-default">确认修改</button>
    </form>

</div>


</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>

    <%--BootStrap美化界面--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表:显示全部书籍</small>
                </h1>
            </div>
        </div>

        <a class="btn btn-primary"
           href="${pageContext.request.contextPath}/book/toAddPage">新增书籍</a>
        <a class="btn btn-primary"
           href="${pageContext.request.contextPath}/book/allBook">显示全部书籍</a>

        <form class="form-inline" style="float: right"
              action="${pageContext.request.contextPath}/book/queryBookByName" method="post">
            <span style="color:#ff0000; font-weight:bold">${error}</span>
            <input type="text" name="bookName" class="form-control" placeholder="请输入需要搜索的书籍名称">
            <input type="submit" value="搜索" class="btn btn-primary">
        </form>


    </div>


    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <th>书籍编号</th>
                <th>书籍名称</th>
                <th>书籍数量</th>
                <th>书籍描述</th>
                <th>操作</th>
                </thead>

                <%--书籍从数据库中查询出来,用foreach遍历list显示出来--%>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookId}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCount}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdate/${book.bookId}">修改</a>
                            &nbsp;|&nbsp;
                            <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookId}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>

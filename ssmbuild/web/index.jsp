<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>

    <%--会更改页面中所有h3标签的样式--%>
    <style>
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;  /*居中*/
            line-height: 38px;
            background: aquamarine;  /*背景颜色*/
            border-radius: 5px;
        }
    </style>

</head>
<body>

<h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
</h3>

</body>
</html>

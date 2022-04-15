<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yuhaiyang
  Date: 2021/4/6
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<from action="/hello" method="post">
    <input type="text" name="method">
    <input type="submit">
</from>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>

    <script>
      function a(){
          $.post({
              url:"${pageContext.request.contextPath}/a1",
              data:{"name":$("#userName").val()},
              success:function (data,status) {
                console.log("data="+data)
                console.log("status="+status)
              }
          })
      }
    </script>

  </head>
  <body>

<%--  onblur:失去焦点--%>
    用户名: <input type="text" id="userName" onblur="a()">

  </body>
</html>

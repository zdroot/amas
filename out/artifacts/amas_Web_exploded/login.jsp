<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-05-17
  Time: 下午 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jquery_3.5.1.js"></script>
<script>
    function login() {
        console.log("前台方法")
       // location.href="reg/a/abcd/lg2.do?name=bbb"
      //  location.href="reg/lg.do?name=aaa";
        /*拦截的测试路径*/
       location.href="reg/ts.do?name=aaa";
        /*过滤的测试路径*/
        //location.href="log?name=aaa";
      /*  $.ajax({
            url:"lg.do",
            method:"get"
            ,
           data:{
                name:"abc",
                pass:"123"
           },
            dataType:"json",
           success:function (dt) {
                console.log(dt.k1)
           }
        });*/
    }
</script>
<body>
<input onclick="login()" type="button" value="登录"/>
</body>
</html>

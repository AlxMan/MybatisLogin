<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
    <title>欢迎登录</title>
</head>
<body>
    <form action="${pageContext.request.contextPath }/user/login"
      method="post">
    用户名:<input type="text" name="username" value="${user.username }" /><br />
    密  码:<input type="password" name="password" value="${user.password }"><br />
        <input type="submit" value="登陆" /><font color="red">${errorMsg }</font>
</form>
</body>
</html>

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
    <form action="${pageContext.request.contextPath }/user/toLogin" method="post">
        <table>
            <tr>
                <td><input type="submit" value="登陆"></td>
            </tr>
        </table>
    </form>
    <form action="${pageContext.request.contextPath }/user/toRegister" method="post">
        <table>
            <tr>
                <td><input type="submit" value="注册" ></td>
            </tr>
        </table>
    </form>
</body>
</html>

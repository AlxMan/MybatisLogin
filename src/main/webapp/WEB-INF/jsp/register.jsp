<%--
  Created by IntelliJ IDEA.
  User: wangxianchao
  Date: 2018/6/12
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("utf-8");%>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/user/register" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input id="username" name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input id="age" name="age" type="age"></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input id="sex" name="sex" type="sex"></td>
        </tr>
        <tr>
            <td>email:</td>
            <td><input id="email" name="email" type="email"></td>
        </tr>
        <tr>
            <td>手机:</td>
            <td><input id="phone" name="phone" type="phone"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>

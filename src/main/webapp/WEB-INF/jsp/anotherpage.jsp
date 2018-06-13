<%--
  Created by IntelliJ IDEA.
  User: wangxianchao
  Date: 2018/6/11
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <strong> ${sessionScope.user.username}!!!!! </strong>
</div>
<form action="${pageContext.request.contextPath }/index.jsp">
    <table>
        <tr>
            <td><input type="submit" value="退出登录" ></td>
        </tr>
    </table>
</form>
</body>
</html>

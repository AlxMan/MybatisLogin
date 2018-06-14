<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"//"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
</head>
<script type="text/javascript" src="<%=path%>/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery.validate.js"></script>
<body>
<form method="post" id="signupForm" >
    <div id="loginError"></div>
    用户名：<input type="text" name="login_name" id="name"/><br>
    密码：<input type="password" name="login_password" id="pwd"/><br>
    <button id="b" onclick="requestJson()" >登录</button>
</form>
</body>
<script type="text/javascript">
    function requestJson(){
        var name =$("#name").val();
        var pwd =$("#pwd").val();
        if(name===""){
            alert("用户名不能为空！");
            return false;
        }
        else if(pwd===""){
            alert("密码不能为空！");
            return false;
        }
        else
        {
            $.ajax({
            url:"${pageContext.request.contextPath}/user/login",
            method:"post",
            data:$('#signupForm').serialize(),
            dataType:'json',
            success:function(ret){
            if(ret.status=='ok'){
            $("#loginError").html("登录成功！");
            var href = '${pageContext.request.contextPath}/user/success';
            window.top.location.href = href;
            }else if(ret.status=='userNameOrPwdError') {
            $("#loginError").html("用户名或密码错误！");
            }
            }
            });
        }
    }
</script>
<%--<script type="text/javascript">--%>
    <%--$(function(){--%>
        <%--$("#b").validate({--%>
            <%--onsubmit:true,// 是否在提交是验证--%>
            <%--rules: {--%>
                <%--login_name: {--%>
                    <%--required: true,--%>
                    <%--minlength: 5--%>
                <%--},--%>
                <%--login_password: {--%>
                    <%--required: true,--%>
                    <%--minlength: 5--%>
                <%--}--%>
            <%--},--%>
            <%--messages: {--%>
                <%--login_name: {--%>
                    <%--required: "请输入用户名",--%>
                    <%--minlength: "用户名至少为5位"--%>
                <%--},--%>
                <%--login_password: {--%>
                    <%--required: "请输入密码",--%>
                    <%--minlength: "密码长度最少为5位"--%>
                <%--}--%>
            <%--},--%>
            <%--submitHandler: function() {--%>
                <%--$.ajax({--%>
                    <%--url:"${pageContext.request.contextPath}/user/login",--%>
                    <%--method:"post",--%>
                    <%--data:$('#signupForm').serialize(),--%>
                    <%--dataType:'json',--%>
                    <%--success:function(ret){--%>
                        <%--if(ret.status=='ok'){--%>
                            <%--$("#loginError").html("登录成功！");--%>
                            <%--var href = '${pageContext.request.contextPath}/user/success';--%>
                            <%--window.top.location.href = href;--%>
                        <%--}else if(ret.status=='userNameOrPwdError'){--%>
                            <%--$("#loginError").html("用户名或密码错误！");--%>
                        <%--}--%>
                    <%--}--%>
                <%--});--%>
            <%--}--%>
        <%--})--%>
    <%--});--%>
<%--</script>--%>
<%--<script type="text/javascript">--%>
    <%--$(function(){--%>
        <%--$('#b').click(function(){--%>
            <%--$.ajax({--%>
                <%--url:"${pageContext.request.contextPath}/user/login",--%>
                <%--method:"post",--%>
                <%--data:$('#signupForm').serialize(),--%>
                <%--dataType:'json',--%>
                <%--success:function(ret){--%>
                    <%--if(ret.status=='ok'){--%>
                        <%--$("#loginError").html("登录成功！");--%>
                        <%--var href = '${pageContext.request.contextPath}/user/success';--%>
                        <%--window.top.location.href = href;--%>
                    <%--}else if(ret.status=='userNameOrPwdError') {--%>
                        <%--$("#loginError").html("用户名或密码错误！");--%>
                    <%--}--%>
                <%--}--%>
            <%--});--%>
            <%--});--%>
    <%--});--%>

 <%--</script>--%>
</html>
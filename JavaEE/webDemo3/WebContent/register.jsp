<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/register_do" method="post">
用户名：<input type="text" name="username" /> <div id="msg"></div> <br/>
密码：<input type="password" name="password" /><br/>
年龄：<input type="text" name="age" /><br/>
性别： 男<input type="radio" name="sex" value="男" checked="checked" />女<input type="radio" name="sex" value="女" /><br/>
<input type="submit" value="注册" />
</form>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Index</title>
</head>
<body>
<c:choose>
<c:when test="${empty user }">
<a href="${pageContext.request.contextPath }/login.jsp">登录</a> <a href="${pageContext.request.contextPath }/register.jsp">注册</a>
</c:when>
<c:otherwise>
当前登录用户：${user.username }
</c:otherwise>
</c:choose>

<br/>
<hr/>
</body>
</html>
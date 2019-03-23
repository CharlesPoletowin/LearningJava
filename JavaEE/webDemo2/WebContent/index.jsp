<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>

<%
out.print("<br>");
System.out.println(this==page);
pageContext.setAttribute("user","www.google.com ",PageContext.SESSION_SCOPE);
System.out.println(session.getAttribute("user"));
out.print("<br>");
%>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
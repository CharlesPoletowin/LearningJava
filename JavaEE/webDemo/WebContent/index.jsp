<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
test for your welcome 中文测试
<%! int count=0; %>
<%
	count++;
	out.println("test for java");
	out.print("the current user is:");
	Date date = new Date();
	List l=new ArrayList();
	out.println(date);
	out.print(count);
	String str="123";
	String username=request.getParameter("username");
	System.out.println(username);
%>
<%=str %>
<form action="login.jsp" method="post">
<input type="text" name="username"/>
<input type="submit"/>
</form>

</body>
</html>
<%@page import="java.io.PrintWriter"%>
<%@page import="webDemo.util.DButil" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
This is the page dealing with the login status!
<%
String username=request.getParameter("username");
PrintWriter writer=response.getWriter();
writer.println("printWriter"+username);
boolean isSuccess =DButil.User(username);
if(isSuccess){
	out.println("<font color='green'>!test Successful!</font>");%>
	<%=username %>
	<%
	
	request.getRequestDispatcher("index.jsp").forward(request,response);
}
else{
	out.println("<font color='red'>!test failure!</font>");
}
%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<%
String email=request.getParameter("email");
String pass=request.getParameter("pass");
if(email==null || pass==null)throw new Exception("Login Failed: Blank Login/Password");
if(email.equalsIgnoreCase("rajarshid@trainee.nrifintech.com") && pass.equals("password")){
	out.println("Logged in as "+email);
}else{
	throw new Exception("Login Failed: Wrong Email/Password");
}
%>
</body>
</html>
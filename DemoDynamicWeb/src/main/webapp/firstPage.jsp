<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date" errorPage="error.jsp" %>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FirstPageJSP</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<!-- throwing an error to check error.jsp page
	< %
	int n=9/0;
	%>
	-->
	
	
	<!-- Directives are page,include and taglib... < %@ used to create tags % >  -->
	<%@ include file="index.html" %>
	
	<!-- custom tags include
	< %@ taglib uri="location of library, out,h methods" prefix="p" %>
	<p.out><p.h>
	 -->
	<%=new Date().toString()%>
	<br/>
	<%!//declaritive tag - doesnt go to service method. run as servlet init
	int n = 100;%>
	<%!
	int sq(int n){return n*n;}
	%>
	<%
	// scriptlet tag - run in servlet service method
	int i = 0, j = 0;
	try{
	i = Integer.parseInt(request.getParameter("num1"));
	j = Integer.parseInt(request.getParameter("num2"));
	}catch(Exception e){out.println(e);}
	
	out.println("<br/>Value of i is" + i+"<br/>");
	out.println("Value of j is" + j+"<br/>");
	out.println("Sum is " + (i + j)+"<br/>");
	out.println("Sq is " + sq(i + j)+"<br/>");
	%>
	
	
	
	<p>Val of n is 
	<!-- Expression tag outputs via println method -->
	<%= n %>
	</p>
	<%= "Expression tag working" %>
	<br/>
	<%= "Square: "+sq(n) %>
</body>
</html>
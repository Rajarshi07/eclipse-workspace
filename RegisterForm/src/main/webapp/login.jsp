<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Login Form</h2>

	<form method="POST" action="loginNext.jsp">
		<label for="email">Enter your email:</label> <input 
			id="email" name="email" type="email" placeholder="Enter Here" /> <br>
		<label for="pass">Enter your password:</label> <input 
			id="pass" name="pass" type="password" placeholder="Enter Here" /> <br>
		<input type="submit" value="Login">
	</form>
	
</body>
</html>
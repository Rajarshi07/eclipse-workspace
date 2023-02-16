<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
</head>
<body>
	<h1>Employees List</h1>
	<a href="emplform">Add new employee</a>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>DESIGNATION</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>
		<c:forEach var="empl" items="${list}">
			<tr>
				<td>${empl.id}</td>
				<td>${empl.name}</td>
				<td>${empl.salary}</td>
				<td>${empl.designation}</td>
				<td><a href="editempl/${empl.id}">Edit</a></td>
				<td><a href="deleteempl/${empl.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
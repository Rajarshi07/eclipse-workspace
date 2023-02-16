<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Employee Information</h1>
	<form:form method="post" action="update">
		<table>

			<tr>
			<!--
				<td>Update Id:</td>  -->
				<td><form:hidden path="id"/></td>
			</tr>
			<tr>
				<td>Update Name:</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Update Salary:</td>
				<td><form:input path="salary" /></td>
			</tr>

			<tr>
				<td>Update Designation:</td>
				<td><form:input path="designation" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="update" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>
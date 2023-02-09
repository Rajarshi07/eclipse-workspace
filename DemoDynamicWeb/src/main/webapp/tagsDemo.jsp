<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taglib Demo</title>
</head>
<body>
	<!-- set tag -->
	<c:set var="i" value="25"></c:set>
	<!-- out tag -->
	<h2>
		out
		<c:out value="${i}"></c:out>
	</h2>
	<!-- remove tag -->
	<h2>
		<c:remove var="i"></c:remove>
	</h2>
	<h2>
		out
		<c:out value="${i}"></c:out>
	</h2>

	<c:set var="j" value="101"></c:set>
	<!-- if tag -->
	<h2>
		<c:if test="${j>20}">Hello</c:if>
	</h2>

	<!-- switch case / choose-when-otherwise -->
	<c:choose>
		<c:when test="${j>100}">j greater than 100</c:when>
		<c:when test="${j<100}">j less than 100</c:when>
		<c:otherwise>default case</c:otherwise>
	</c:choose>
	<br />
	<!-- for each loop -->
	<c:forEach var="k" begin="1" end="10">
	k=<c:out value="${k}"></c:out>
		<br />
	</c:forEach>

	<!--  url- redirect - params  disabled redirect..remove space to activate-->
	<c:url var="google" value="https://google.com/search">
		<c:param name="q" value="jstl"></c:param>
	</c:url>
	<c :redirect url="${google }"></c :redirect>


	<!-- functions -->
	<c:set var="name" value="rajarshi"></c:set>
	<c:out value="Length of string `${name }` is ${fn:length(name) }"></c:out>


	<!-- sql -->	
	<sql:setDataSource driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521/xe" user="rajarshi" password="Oracle_1" var="ds"></sql:setDataSource>

	<sql:query dataSource="${ds }" var="rs">SELECT 'ABCDEF12345' AS id FROM DUAL;</sql:query>
	<c:forEach items="${rs.rows }" var="row">
	<c:out value="row.id"></c:out><br>
	
	</c:forEach>

</body>
</html>
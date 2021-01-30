<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About page</title>
</head>
<body>
	<h1>Hello this is about page</h1>

	<%
	/* String name1 = (String)request.getAttribute("fname"); */
	/* String name2 = (String) request.getAttribute("lname"); */
	LocalDateTime date = (LocalDateTime) request.getAttribute("time");
	%>

    <!-- Using jstl -->
	<c:forEach var="item" items="${students }">
		<%-- <h1>students is = ${item }</h1> --%>
		<h1> <c:out value="${item}"></c:out> </h1>
	</c:forEach>


	<!-- Using Expresion language -->
	<h1>first name is = ${fname}</h1>


	<%-- <h1>last name is = <%= name2 %></h1> --%>
	<h1>last name is = ${lname}</h1>
	<h1>
		Data Time is =
		<%=date%></h1>

</body>
</html>
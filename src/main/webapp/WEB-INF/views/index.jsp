<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>

<%
String name = (String)request.getAttribute("name");
%>

<h1>name is : <%=name%></h1>
<!-- Get Data from controller -->
<% 
List<String> list = (List<String>)request.getAttribute("f");
for(String s:list)
{
%>

<h1>friends is = <%=s %></h1>

<%
}
%>

</body>
</html>
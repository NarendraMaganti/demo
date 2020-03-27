<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./createCookie">Click here</a> to create cookie
	<a href="./readCookie">Click here</a> to read cookie
	<% if (msg!=null && !msg.isEmpty()) {%>
	<h1><%=msg %></h1>
	<% } %>
</body>
</html>
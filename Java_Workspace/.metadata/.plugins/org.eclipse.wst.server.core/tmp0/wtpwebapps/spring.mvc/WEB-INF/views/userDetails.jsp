<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% int userId = (int) request.getAttribute("userId");
	String password = (String) request.getAttribute("pwd");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hello <%=userId %></h1>
	<h1>Password <%=password %></h1>

</body>
</html>
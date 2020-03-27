<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%String msg=(String) request.getAttribute("msg"); %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./createCookie">ClickHere</a> to create cookie 
<a href="./readCookie">ClickHere</a>to read cookie
<%if(msg !=null && !msg.isEmpty()) { %>
<h1><%=msg %></h1>
<%} %>
</body>
</html>
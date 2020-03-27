<%@page import="com.capgemini.springmvc1.controllers.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <!--  <% int userId=(int) request.getAttribute("un"); %>   
     <% String password=(String) request.getAttribute("pwd"); %>   -->
     <% UserBean userbean=(UserBean) request.getAttribute("userbean");  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello <%=userId %></h1>
<h1>Password <%=password %></h1>
<h1>Hello <%=userbean.getUserName()%></h1>
<h1>Hello <%=userbean.getPassword() %></h1>

</body>
</html>
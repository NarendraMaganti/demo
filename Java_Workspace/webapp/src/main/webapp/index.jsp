<%@page import="java.util.Date"%>
<%@include file="/index.html" %>
<%@page errorPage="error.jsp"  %>
<%@page isThreadSafe="false" %>
<%@page session="false" %>
<%!
private int i=10;
private String name="Saikumar";
public void printName(){
	System.out.println(name);
}
%>

<html>
<body bgcolor="sky blue">
<%
Date date=new Date();
%>
<h1 style="color:blue"> 
<%= date %>
System.out.println("code 1");
</h1>
<h2 style="color:blue"><%=i %>
</h2>
<p><%=name %> <p>
<h3>
<% printName(); %>
</h3>

<!--  <%System.out.println(1/0); %> -->


</body>
</html>
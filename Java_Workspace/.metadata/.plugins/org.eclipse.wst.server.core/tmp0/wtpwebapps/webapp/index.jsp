<%@page import="java.util.Date" %>
<%@include file="/index.html" %>
<%@page errorPage="/error.jsp" %>
<%@page isThreadSafe="false" %>
<%!private int i = 10;%>
<html>

<body>
	<%
		Date date = new Date();
		System.out.println("code 1");
	%>

	<h1 style='color: pink'><%=date%></h1>

	<%
		System.out.println("code 2");
	%>
		<h2><%=i%></h2>


	<%
		System.out.println("code 3");
		printName();
	%>
</body>
</html>
<%!
private String name ="Narendra";
public void printName(){
	System.out.println(name);
}
%>

<%!
	public void jspInit(){
	
	System.out.println("Init method");
}
%>

<%!
	public void jspDestroy(){
	System.out.println("Destroy method");
}
%>

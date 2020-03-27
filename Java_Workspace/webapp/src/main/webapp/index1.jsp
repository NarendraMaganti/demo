<%!
public void jspInit(){
System.out.println("Init method");
}
%>
<%!
public void jspDestroy(){
System.out.println("Destroy  method");
}
%>
<%!

private int i=10;
private String name="saikumar";



%>
<html>
<body>

<%=i %>
<%=name %>



</body>
</html>
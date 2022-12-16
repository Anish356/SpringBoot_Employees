
<%@page import="com.Records.entities.Employees"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Center>
<h2> All SAVED DATA</h2>
<table>



<table border=1>

<tr>
<th>Id</th>
<th>Name</th>
<th>DOB</th>
<th>Email</th>
<th>Age</th>
<th>Salary</th>
<th>Status</th>
<th>Delete</th>
<th>Update</th>
</tr>

<%

 List set= (List)request.getAttribute("values");
  ListIterator it=set.listIterator();
  String sr;
  while(it.hasNext()){
	  Employees x=(Employees)it.next();
      if(x.isStatus()==true)
      {
    	  sr="Active";
      }
      else
      {
    	  sr="Inactive";
      }
      
      System.out.print(sr);
%>

<tr>
<td><%=x.getId() %></td>
<td><%=x.getName() %></td>
<td><%=x.getDOB() %></td>
<td><%=x.getEmail() %></td>
<td><%=x.getAge() %></td>
<td><%=x.getSalary() %></td>

<td><%=sr  %></td>
<td><a href="DeleteId?id=<%=x.getId() %>" >delete</a></td>
<td><a href="UpdateId?id=<%=x.getId() %>" >update</a></td>
</tr>

<% } %>

</table>
</Center>
</body>
</html>
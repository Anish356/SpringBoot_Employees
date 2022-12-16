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

<h1>Registration...</h1>

<form action="SaveIntoDB" method="post">

<table border="1">

<tr>
<td>Name </td>
<td><input type="test"  name="name" ></td>
</tr>

<tr>
<td>Email </td>
<td><input type="email"  name="email" ></td>
</tr>

<tr>
<td>DOB</td>
<td><input type="date" name="DOB" ></td>
</tr>



<tr>
<td>Age </td>
<td><input type="number" name="age" ></td>
</tr>

<tr>
<td>Salary </td>
<td><input type="number"  name="salary" ></td>
</tr>

<tr>
<td>Status</td>
<td><input type="text"  name="status"  placeholder="Active/Inactive"></td>
</tr>

<tr>

<td><input type="submit"  name="save"></td>
</tr>

</table>




</form>
<h1> </h1>



</Center>



</body>
</html>
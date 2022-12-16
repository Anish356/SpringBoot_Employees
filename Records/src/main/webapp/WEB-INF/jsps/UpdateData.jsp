<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update data</title>
</head>
<body>
<Center>

<h1>UPDATE Data</h1>

<form action="UpdateData" method="post">

<table border="1">

<tr>
<td>Id</td>
<td><input type="test"  name="id"  value=${id} readonly></td>
</tr>
<tr>
<td>Name </td>
<td><input type="test"  name="name" value=${name}></td>
</tr>

<tr>
<td>Email </td>
<td><input type="email"  name="email" value=${email}></td>
</tr>

<tr>
<td>Age </td>
<td><input type="number"    name="age" value=${age}></td>
</tr>

<tr>
<td>Salary </td>
<td><input type="number"  name="salary" value=${salary}></td>
</tr>
<tr>
<td>DOB</td>
<td><input type="text"  name="DOB" value=${DOB} ></td>
</tr>
<tr>
<td>Status</td>
<td><input type="text"  name="status" value=${status} ></td>
</tr>


<tr>

<td><input type="submit"  name="save" value="update" ></td>
</tr>


</table>




</form>
<h1> </h1>

<h2>${msg}</h2>

</Center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registered Successfully. </h1>
<h3>Please verify below information. If found incorrect please contact our customer service</h3>

<table>
	<tr>
		<td>First Name </td>
		<td>: </td>
		<td>${person.fName}</td>
	</tr>
	<tr>
		<td>Middle Name </td>
		<td>: </td>
		<td>${person.mName}</td>
	</tr>
	<tr>
		<td>Last Name </td>
		<td>: </td>
		<td>${person.lName}</td>
	</tr>
	<tr>
		<td>Gender </td>
		<td>: </td>
		<td>${person.gender}</td>
	</tr>
	<tr>
		<td>Address </td>
		<td>: </td>
		<td>${contact.address}</td>
	</tr>
		<tr>
		<td>City </td>
		<td>: </td>
		<td>${contact.city}</td>
	</tr>
		<tr>
		<td>State </td>
		<td>: </td>
		<td>${contact.state}</td>
	</tr>
		<tr>
		<td>Country </td>
		<td>: </td>
		<td>${contact.country}</td>
	</tr>
		<tr>
		<td>Phone No. </td>
		<td>: </td>
		<td>${contact.phone}</td>
	</tr>
		<tr>
		<td>Bank </td>
		<td>: </td>
		<td>${bank.bank}</td>
	</tr>
	<tr>
		<td>Account # </td>
		<td>: </td>
		<td>${bank.acc}</td>
	</tr>
	<tr>
		<td>SSN </td>
		<td>: </td>
		<td>${bank.ssn}</td>
	</tr>
</table>

</body>
</html>
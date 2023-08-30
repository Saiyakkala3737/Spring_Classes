<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personal Information</title>
</head>
<h3>Person Registration Form</h3>
<body>
	<form:form action="addPerson" modelAttribute="Person">
    First Name : <form:input path="fName" />
		<br>
		<br>
    Middle Name : <form:input path="mName" />
		<br>
		<br>
		Last Name :  <form:input path="LName" />
		<br>
		<br>
		Gender:   
        Male <form:radiobutton path="gender" value="Male" />  
        Female <form:radiobutton path="gender" value="Female" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>
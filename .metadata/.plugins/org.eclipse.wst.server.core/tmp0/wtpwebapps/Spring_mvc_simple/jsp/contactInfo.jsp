<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
</head>
<h3>Contact Registration Form</h3>  
<body>
<form:form action="addContact" modelAttribute="Contact">
		Address :  <form:input path="address"/>
		<br><br>
		City :  <form:input path="city"/>
		<br><br>
		State :  <form:input path="state"/>
		<br><br>
		Country :  <form:input path="country"/>
		<br><br>
		Phone No :  <form:input path="phone"/>
		<br><br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>
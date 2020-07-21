<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="processLoginForm" method="GET"
		modelAttribute="employee">

		<label>Username:</label>
		<form:input path="username" />
		<br>
		<br>

		<label>Password:</label>
		<form:input path="password" />
		<br>
		<br>

		<input type="Submit" value="Login" />


	</form:form>

</body>
</html>
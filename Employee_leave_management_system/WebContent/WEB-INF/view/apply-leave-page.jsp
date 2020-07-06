<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.time.*"%>
<%
	String localTime = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply Leave Page</title>
</head>
<body>
	<form:form action="saveLeaveInfo" method="post" modelAttribute="Leave">

		<label>Start date:</label>
		<form:input path="startDate" type="date" />
		<br>
		<br>

		<label>End date:</label>
		<form:input path="endDate" type="date" />
		<br>
		<br>

		<label>Reason:</label>
		<form:input path="reason" type="text" />
		<br>
		<br>

		<%
			LocalTime time = LocalTime.now();
		localTime = time.toString();
		out.print(localTime);
		%>


		<c:set var="localTime" scope="session"
			value="${leave.applicationTimestamp}" />

		<form:select path="leaveType">
			<c:forEach items="${leaveTypes}" var="tempLeaveTypes">
				<form:option value="${tempLeaveTypes}">${tempLeaveTypes.name}</form:option>
			</c:forEach>
		</form:select>

		<input type="Submit" value="Submit">


	</form:form>
</body>
</html>
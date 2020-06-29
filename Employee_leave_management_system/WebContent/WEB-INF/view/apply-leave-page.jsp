<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply Leave Page</title>
</head>
<body>
	<form:form action="saveLeaveInfo" method="get"
		modelAttribute="applyLeaveInfo">

		<form:input  path ="startDate"/>

		<label for="start">Start date:</label>

		<input type="date" id="start" name="trip-start" value="2018-07-22"
			min="2018-01-01" max="2018-12-31">

		
		<select name="leaveType">

			<c:forEach items="${LeaveTypeNames}" var="tempLeaveName">
				<option value="${tempLeaveName}">${tempLeaveName}</option>
			</c:forEach>


		</select>

	</form:form>
</body>
</html>
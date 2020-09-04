<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Info</title>
</head>
<body>
<table>

	<tr>
		<th>Reason for leave:</th>
		<td>${leaveInfo.reason}</td>
	</tr>
	
	<tr>
		<th>Start date:</th>
		<td>${leaveInfo.startDate}</td>
	</tr>
	
	<tr>
		<th>End date:</th>
		<td>${leaveInfo.endDate}</td>
	</tr>
	
	<tr>
		<th>Application timestamp:</th>
		<td>${leaveInfo.applicationTimestamp}</td>
	</tr>
	
	

</table>
</body>
</html>
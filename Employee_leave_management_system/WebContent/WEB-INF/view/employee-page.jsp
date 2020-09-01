<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee page</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/employee/applyPage">Appply
		for Leave</a>
	<c:url var="updateLink" value="${pageContext.request.contextPath}/employee/updatePage"></c:url>	
	<a href="${updateLink}">update leave</a>
	
</body>
</html>
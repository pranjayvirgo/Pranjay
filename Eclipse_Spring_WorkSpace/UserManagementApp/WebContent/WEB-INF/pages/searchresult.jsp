<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 

"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="refresh" 

content="${pageContext.session.maxInactiveInterval};url=/UserManagementApp/home">

<title>Search Result Page</title>
</head>
<body>


	<c:if test="${!empty userList}">
	<h2>Search Results</h2>
		<h3>Users</h3>
		<table>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.userID}</td>
					<td>${user.emailID}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${empty userList}">
	<h3>No User Found For Given Criterias</h3>
	</c:if>
<p><a href="${pageContext.request.contextPath}/myhome">MyHome</a><br />
</body>

</html>
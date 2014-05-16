<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="refresh" content="${pageContext.session.maxInactiveInterval};url=/UserManagementApp/home">

<title>Home page</title>
<script>
    var secondsBeforeExpire = ${pageContext.session.maxInactiveInterval};
    var timeToDecide = 15; // Give client 15 seconds to choose.
    setTimeout(function() {
        alert('Your session is about to timeout in ' + timeToDecide + ' seconds!')
    }, (secondsBeforeExpire - timeToDecide) * 1000);
</script>
</head>
<body>
<h1>Welcome ${username}</h1>
<form:form method="post" action="myhome/search" modelAttribute="searchform">
	<table>
	<tr>	
			<td><form:input path="userName" /></td>
			<td colspan="2"><input type="submit" value="Search" /></td>
		</tr>
	</table>
		</table>
</form:form>
	<c:if test="${!empty userList}">
		<h3>Users</h3>
		<table class="data">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.userName}</td>
					<td>${user.emailID}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<p><a href="${pageContext.request.contextPath}/myhome/reset">Reset
	Password</a><br />
	</p>
	<a href="<c:url value='j_spring_security_logout'/>" />
	Logout
	</a>
</body>

</html>
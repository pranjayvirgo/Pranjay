<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta http-equiv="refresh" content="${pageContext.session.maxInactiveInterval};url=/UserManagementApp/home">
<title>Welcome page</title>
</head>
<body>
<h1>New Password For Login ${newpassword}</h1>
<p>You have successfully reset your password.<br/></p>
<p>
<a href="${pageContext.request.contextPath}/home">Proceed to Login Again</a><br/>
</p>
</body>

</html>
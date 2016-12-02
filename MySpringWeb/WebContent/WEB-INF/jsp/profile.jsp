<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>

<c:out value="Welcome Mr."></c:out>
<c:out value="${spitterUser.userName}"></c:out>

<h1>Your Profile</h1>
<c:out value="${spitterUser.userName}" /><br/>
<c:out value="${spitterUser.firstName}" />
<c:out value="${spitterUser.lastName}" />
</body>
</html>
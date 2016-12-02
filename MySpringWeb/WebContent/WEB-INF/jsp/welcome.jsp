<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Spittr</title>
<link rel="stylesheet"
type="text/css" href="<c:url value="/resources/style.css"/>" />
</head>
<body>
<h1>Welcome to Spittr</h1>
<%-- <a href='<c:url value="/spittles.do?count=2"/>' >Spittles</a> | --%>
<a href='<c:url value="/spittles.do?count=2"/>' >Spittles</a> 
<a href="<c:url value='/spittles.do/register.do' />">Register</a>
</body>
</html>
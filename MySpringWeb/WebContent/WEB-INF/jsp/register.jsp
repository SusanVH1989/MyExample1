<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style>
span.error {
color: red;
}
</style>
</head>
<body>
<html:form method="POST" commandName="spitterUser">


	First Name: <html:input  path="firstName" /><html:errors path="firstName" /><br/>
	Last Name: <html:input  path="lastName" /><html:errors path="lastName" /><br/>
	Username: <html:input path="userName" /><html:errors path="userName" /><br/>
	Password: <html:password  path="pwd" /><html:errors path="pwd" /><br/>
	<input type="submit" value="Register" />

</html:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>spittle</title>
</head>
<body>
<c:out value="hi"/><table>
<c:if test="${not empty spittleList}">
<c:forEach items="${spittleList}" var="spittle">
<tr><td>
<c:out value="${spittle.message}"></c:out> 

</td></tr>
</c:forEach>
</c:if>
<tr>
<td><a href="<c:out value='/spittles.do?count=2'/>">next</a></td></tr>
</table><%-- 
<c:if test="${empty spittleList}">

<c:out value="${spittle.id}"></c:out>
</c:if> --%>

</body>
</html>
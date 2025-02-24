<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css'/>">


<title>Insert title here</title>
</head>
<body>
<%-- Display the success message if it exists --%>
    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
	<form method="post" action="/viewc/addUser">
		ID :<br /> 
		<input type="text" name="id">
		<br /> 
		User name :<br />
     	<input type="text" name="userName"><br/> 
		<input type="submit" value="Add">
	</form>
</body>
</html>

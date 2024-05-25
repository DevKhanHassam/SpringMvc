<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Details</title>
</head>
<body>
	<p>Your First Name is ${userDetails.firstName}</p>
	<p>Your Last Name is ${userDetails.lastName}</p>
	<p>Your Password is ${userDetails.password}</p>
	<p>Your Country is ${userDetails.country}</p>
	<p>
		Your Hobby's is/are
	<c:forEach var="tempIterator" items="${userDetails.hobby}">
		${tempIterator}
	</c:forEach>
	

	</p>
	<p>Your Gender is ${userDetails.gender}</p>
	<p>
	
	<p>Your phone number is ${userDetails.commDto.mobileNO} 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
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
	<p>Your Hobby's is ${userDetails.hobby}</p>
	<p>Your Gender is ${userDetails.gender}</p>

</body>
</html>
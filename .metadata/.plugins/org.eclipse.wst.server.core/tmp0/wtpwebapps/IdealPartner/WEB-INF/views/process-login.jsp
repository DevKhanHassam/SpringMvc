<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Process login</h1>
	<div>
		<h2>Your name=${userInfo.yourName}</h2>
		<h2>Your Crush name= ${userInfo.crushName} </h2>
		
		<a href="emailSend">Send Email</a>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>your name is ${yourName} </p>
		
		<br>
		Enter Email:

		<form:form action="emailSendSucess" method="get"
			modelAttribute="emailDto">
			<form:input path="email" />

			<input type="submit" value="send">
		</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<form:form action="process-login" method="get" modelAttribute="userInfo">
	
     	<div>
			<label for="YourName">Your Name</label> 
			<form:input id="YourName" path="yourName"/>	
		</div>
		
		<br>
		
		<div>
			<label for="CrushName">Crush Name</label> 
			<form:input id="CrushName" path="crushName"/>
		</div>
		
		<br>
		<div>
			<input type="submit" value="submit">
		</div>
	
	
	</form:form>
	
	
</body>
</html>
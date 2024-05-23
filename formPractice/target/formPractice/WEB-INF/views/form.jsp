<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registeration Form</title>
</head>
<body>
	<div align="center">
		<h1>Registeration Form</h1>

		<br>

		<form:form action="userDetails" method="get"
			modelAttribute="userDetails">
			<label for="firstName">Name:</label>
			<form:input id="firstName" path="firstName" />
			<div></div>
			<label for="lastName">Last Name:</label>
			<form:input id="lasttName" path="lastName" />
			<div></div>
			<label for="password">Enter Password</label>
			<form:password id="password" path="password" />
			<div></div>
			<label for="country">Select Country</label>
			<form:select id="country" path="country">
				<form:option value="Hungary" label="Hungary"></form:option>
				<form:option value="Germany" label="Germany"></form:option>
				<form:option value="Russia" label="Russia"></form:option>
			</form:select>
			<div></div>
			<label>Hobbys</label>
		     cricket <form:checkbox path="hobby" value="cricket" />
		     football <form:checkbox path="hobby" value="football" />
		     Tennis <form:checkbox path="hobby" value="Tennis" />
		     driving <form:checkbox path="hobby" value="driving" />
		     
		     <div></div>
		     
		     <label>Gender</label>
		     <form:radiobutton label="Male" value="Male" path="gender"/>
		      <form:radiobutton label="Female" value="female" path="gender"/>
		      
		      <input type="submit">

		</form:form>

	</div>
</body>
</html>
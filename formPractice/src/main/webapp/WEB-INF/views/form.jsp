<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registeration Form</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 4px;
	margin-bottom: 4px;
}
</style>



</head>
<body>
	<div align="center">
		<h1>Registeration Form</h1>

		<br>

		<form:form action="userDetails" method="get"
			modelAttribute="userDetails">
			<label for="firstName">Name:</label>
			<form:input id="firstName" path="firstName" />
			<form:errors path="firstName" cssClass="error"></form:errors>

			<p>


				<label for="lastName">Last Name:</label>
				<form:input id="lasttName" path="lastName" />
			<p>
				<label for="password">Enter Password</label>
				<form:password id="password" path="password" />
				<form:errors path="password" cssClass="error"></form:errors>
			<p>


				<label for="country">Select Country</label>
				<form:select id="country" path="country">
					<form:option value="Hungary" label="Hungary"></form:option>
					<form:option value="Germany" label="Germany"></form:option>
					<form:option value="Russia" label="Russia"></form:option>
				</form:select>
			<p>


				<label>Hobbys</label> cricket
				<form:checkbox path="hobby" value="cricket" />
				football
				<form:checkbox path="hobby" value="football" />
				Tennis
				<form:checkbox path="hobby" value="Tennis" />
				driving
				<form:checkbox path="hobby" value="driving" />
			<p>

				<label>Gender</label>
				<form:radiobutton label="Male" value="Male" path="gender" />
				<form:radiobutton label="Female" value="female" path="gender" />
				<form:errors path="gender" cssClass="error"></form:errors>
			<p>
				<label>Email</label>
				<form:input path="commDto.email" />
			<p></p>

			<label>Enter CountryCode</label>
			<form:input path="commDto.mobileNO.countrycode" />
			<form:errors path="commDto.mobileNO.countrycode" cssClass="error"></form:errors>
			<p>
			<label>Enter Number</label>
			<form:input path="commDto.mobileNO.userNumber" />
			<form:errors path="commDto.mobileNO.userNumber" cssClass="error"></form:errors>
			
			<p>
			
			<label for="age">Age</label>
				<form:input path="age" />
				<form:errors path="age" cssClass="error"></form:errors>
			


			<p>
			
			
			
			
			
			<p>
				<label for="termAndConditon">Term and Condition</label>
				<form:checkbox id="termAndConditon" path="termAndConditon" />
				<form:errors path="termAndConditon" cssClass="error"></form:errors>
			<p>
				<input type="submit">
		</form:form>
			
			
			
			
			
			
			
			
			
	</div>
</body>
</html>
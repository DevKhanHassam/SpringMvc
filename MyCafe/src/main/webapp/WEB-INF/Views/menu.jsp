<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order In Process</title>
</head>
<body>


	<div align="center">
		<h2>Place your order ${MyName}</h2>
		<form action="inprocess">

			<label for="dishName">Dish Name:</label> 
				<input type="text" name="dishName" id="dishName" placeholder="Pizza"> <input type="submit">

		</form>

	</div>
</body>
</html>
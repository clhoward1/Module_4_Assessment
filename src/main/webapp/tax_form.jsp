<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome to the Java EE World</title>
	</head>

	<body>
		<h1>Price Calculator</h1>
		
		<h1>With Tax</h1>
		<form action="getPriceTaxServlet" method="post">
			Enter the price of the item and the amount:
			<p>Price: </p><input type="text" name="itemPrice" size="10">
			<br>
			<p>Amount: </p><input type="text" name="itemAmount" size="10">
			<br>
			<p>Tax Percentage (without the %): </p><input type="text" name="tax" size="10">
			<br>
			<br>
			<input type="submit" value="Calculate Total"/>
		</form>
		
		<br>
		<a href="index.jsp">Or you can calculate without tax</a>
	</body>

</html>
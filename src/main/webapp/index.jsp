<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Price Calculator No Tax</title>
	</head>

	<body>
		<h1>Price Calculator</h1>
		
		<h1>No Tax</h1>
		<form action="getPriceServlet" method="post">
			Enter the price of the item and the amount:
			<p>Price: </p><input type="text" name="itemPrice" size="10">
			<br>
			<p>Amount: </p><input type="text" name="itemAmount" size="10">
			<br>
			<br>
			<input type="submit" value="Calculate Total"/>
		</form>
		
		<br>
		<a href="tax_form.jsp">Or you can calculate with tax included</a>
	</body>

</html>
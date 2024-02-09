<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Results With Tax</title>
	</head>
	
	<body>
		<p>${itemsTotal.getItemAmount()} items at ${itemsTotal.getItemPrice()} with a ${itemsTotal.getTax()}% tax costs: </p>
		<br>
		<h3>$${itemsTotal.getTotalWithTax()}</h3>
		
		<a href="tax_form.jsp">Calculate more with tax</a>
		<br>
		<a href="index.jsp">Or calculate with no tax</a>
	</body>
</html>
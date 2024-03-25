<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
    <link href="css/index.css" rel="stylesheet">

</head>
<body>
<div class="nav">
                <ul>
                    <li><a href="home">Home</a></li>
                    <li><a href="route_register">SignUp</a></li>
                    <li><a href="route_login">Login</a></li>
                    <li><a href="about">About</a></li>
                </ul>
            </div>

<div>

	<h1>Products List</h1>
	<table>
	
		<tr>
			<th>Id</th>
			<th>Product Name</th>
			<th>Product Description</th>
			<th>Buy</th>
			
		</tr>
		
		
		<c:forEach var="product" items="${productlist}">
			<tr>
				<td>${product.id}</td>
				<td>${product.productName}</td>
				<td>${product.productDescription}</td>
				<td><a href="checkOut">BUY</a></td>
			
			</tr>
			
		</c:forEach>
	
	</table>

</div>

<br><br><br><br><br><br><br><br>
<footer>
	@Copyright 2022
</footer>

</body>
</html>
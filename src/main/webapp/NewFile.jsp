<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
<h1 align="center">Products</h1>

<c:forEach items="${products}" var="product" >
	<p align="center">${product.getP_name()}</p>
	<img src="P_image.jsp?Product_id=${product.getProduct_id()}" width="180px"/>
</c:forEach>
</body>
</html>
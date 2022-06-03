
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Groupit.Dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add product</title>
</head>
<body>
<b>View all products |<a href="<%= request.getContextPath() %>/Demo">Products</a></b><br/>
<form action="AddProduct" method="post" enctype="multipart/form-data">
	<input type="text" name="P_name" placeholder="P_name*"><br/><br/>
	<input type="text" name="P_description" placeholder="P_description"><br/>
	<input type="text" name="P_Quantity" placeholder="P_Quantity"><br/><br/>
	<input type="text" name="P_UnitPrice" placeholder="P_UnitPrice"><br/><br/>
	<input type="text" name="User_id" placeholder="User_id"><br/><br/>
	<input type="text" name="Category_id" placeholder="Category_id"><br/><br/>
	<input type="file" name="image" placeholder="image"/><br/><br/>
	
	
	<input type="submit" name="submitbutton">
</form>
	

</body>
</html>
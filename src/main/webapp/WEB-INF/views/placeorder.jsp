<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Just Eat</h1>
<form action="orderplace">
 CUSTOMER NAME:<input type="text" name="customername">
ADDRESS:<input type="text" name="address">
PHONE:<input type="text" name="phone">
Topping:<select>
<option>Capsicum</option>
<option>Mushroom</option>
<option>Paneer</option>
</select>
<input type="placeorder" value="placeorder">
</form>
</body>
</html>
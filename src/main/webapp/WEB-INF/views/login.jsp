
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>  
.error{color:red}  
</style> 
</head>
<body>

<sf:form action="doAdd"  modelAttribute="userBean"  method="post">
	
<%-- <sf:label path="uname">UserName:</sf:label> --%>
UserName:<sf:input path="uname"/>
  <sf:errors path="uname" cssClass="error"/> <br> <br>  
<%-- 	<sf:label path="pwd">Password:</sf:label> --%>
Password:<sf:password path="pwd"/>
   <sf:errors path="pwd" cssClass="error"/> 	<br><br>  
	<input type="submit" value="Add a User" /><br />

</sf:form>
</body>
</html>
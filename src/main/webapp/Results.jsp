<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	
	int v = (Integer)request.getAttribute("sum");

	
	
	%>
	<h1> The value is <%= v %> </h1>
</body>
</html>
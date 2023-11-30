<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.*"%>
	<%@page import="promotion.Promotion"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	
	<%
	ArrayList<Promotion> l = new ArrayList<>(); 
	
	Promotion p = new Promotion();
	
	l = p.List();
	
	%>
	
	<table border="1">
	
	<%
	for(Promotion w: l) {
		int id;
		String name;
		String vehiclet;

		id = w.getId();		
		name = w.getName();
		vehiclet = w.getVehichle_type();
		
	%>
	
	<tr>

	<td>
	<%=id %>
	</td>
	<td>
	<%=name %>
	</td>
	<td>
	<%=vehiclet%>
	</td>
	

	</tr>
	<%
		}
	
		
	%>
	</table>



	


	<a href="index.jsp">Index</a>
</body>
</html>
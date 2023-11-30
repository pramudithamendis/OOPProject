<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@page import="promotion.Promotion"%>
    		<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>


a{
text-decoration: none;

color: Black;

}
</style>
</head>
<body>



	<table border="1" >
<tr>
<td>
<a href="insert.jsp">Insert promotions</a>
</td>
<td>
<a href="list.jsp" >--Select promotions--</a>
</td>
<td>
<a href="Delete.jsp">Delete promotions</a>
</td>
<td>

<a href="update.jsp" >Update promotions</a>
</td>

</tr>

</table>


<br><br><br>


 
 <%
	ArrayList<Promotion> l = new ArrayList<>(); 
	
	Promotion p = new Promotion();
	
	l = p.List();
	
	%>
	
	<table border="1">
	<tr>
	<th>Id</th>
	<th>Promotion name</th>
	<th>Vehicle type</th>
	</tr>
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
	
	 <%// End of the section of list %>
	
	





	

</body>
</html>
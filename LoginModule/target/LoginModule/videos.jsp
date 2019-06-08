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
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp"); 
		}	
	
	%>
	<h2> Videos page </h2>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/ZrnAF49ZeHw" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	
	<br><br><br><br>
	
	<a href="http://localhost:8080/LoginModule/aboutus.jsp">Aboutus</a><br><br><br>
	
	
	
	<form action="logout">
		<input type="submit" value="Logout">
	
	</form>
</body>
</html>
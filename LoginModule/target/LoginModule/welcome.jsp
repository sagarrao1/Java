<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
		
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0 for older version 
		
		response.setHeader("Expires", "0"); //for proxies
	
		if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp"); 
		}	
	
	%>
	<h2>Welcome ${username} </h2>
	
	<a href="http://localhost:8080/LoginModule/videos.jsp">videos</a> <br>	
	<a href="http://localhost:8080/LoginModule/aboutus.jsp">Aboutus</a><br> <br><br><br>
	
	<form action="logout">
		<input type="submit" value="Logout">
	
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome to world of Spring MVC frame work using Spring boot.	
	
	<form action="addAlian" method="post">
	 	<br><br>
		Enter your id : <input type="text" name="aid"/> <br>
		Enter your name : <input type="text" name="aname"/> <br><br>
		<input type="submit">	
	</form>
	<hr>

	<form action="getAlian">
	 	<br><br>
		Enter your id : <input type="text" name="aid"/> <br>
		<input type="submit">	
	</form>
	<hr>
	<form action="removeAlian">
	 	<br><br>
		Enter your id of Alian to remove: <input type="text" name="aid"/> <br>
		<input type="submit">	
	</form>
	<hr>
		<form action="getAlianByName">
	 	<br><br>
		Enter Alian name: <input type="text" name="aname"/> <br>
		<input type="submit">	
	</form>
	
</body>
</html>
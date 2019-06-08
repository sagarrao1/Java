<%@page import="com.learning.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">

	<%
		//Student s1= (Student) request.getAttribute("student");
		Student s1= (Student) session.getAttribute("student");
		out.println(s1);
	%>
	<br><br><br><br><br>
	<a href="index.jsp"> To know another student details click here</a>

</body>
</html>
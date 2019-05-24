
<!-- Directive -->

<%@page import="java.util.Scanner"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!-- JSP Tags 
Declartive
Directive
Scriplet
Expression
 -->
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="green">
	
	<!-- Declarative -->
	<%!
		int ap=8; 
		
	%>
	
	<h1> Hello World</h1>
	<!-- Scriplet -->
	<%
		int i= Integer.parseInt(request.getParameter("num1"));
		int j= Integer.parseInt(request.getParameter("num2"));
		
		int k=i+j;
		
		out.println("OutPut : "+k);
   %>	
   
   My Instance variable value is <%= ap%>
   
</body>
</html>
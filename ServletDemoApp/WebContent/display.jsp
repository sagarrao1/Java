<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.*" %>    

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Hello World</h1>
	
	<c:set var="str"  value="Sagar is learning Java"/>
	
	Length:${fn:length(str)}
	
	<%-- <c:forEach items="${fn:split(str,'a')}" var="s">
		<br>
		${s}
	</c:forEach> --%>
	<br>
	<%-- index : ${fn:indexOf(str,"is")} --%>
	
	
	<c:if test="${fn:endsWith(str,'Java')}" >
		str ends with Java 	
	</c:if>
	<br>
	${fn:toUpperCase(str) }
	<%-- <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/sys" user="root" password="admin"/>
	<sql:query var="rs" dataSource="${db}" >select * from tasks</sql:query>
	
	<c:forEach items="${rs.rows}" var="row">
		<c:out value="${row.task_id}"> </c:out>: <c:out value="${row.title}"> </c:out></br>
	</c:forEach>
	 --%>
	
	
	
	
	<%--    	${students} <br>
	
	<c:forEach items="${students}" var="s">
		${s.rollNo}    ${s.name } </br>
	
	</c:forEach>
 --%>	
 	
 	
 	<%-- <c:out value="${label}" /> --%>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <% 
		String name2=request.getAttribute("label").toString();
		out.println(name2);
	%> --%>
	
	<%-- ${students} --%>
	<%-- <c:forEach items="${students}" var="s">
		${s.name}<br/>
	</c:forEach> --%>
	 <h4> Connets to mysql database and get task records from tasks table: </h4> </br></br></br></br> 
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/sys" user="root" password="admin"/>
	<sql:query var="rs" dataSource="${db}" >select * from tasks</sql:query>
	
	<c:forEach items="${rs.rows}" var="row">
		<c:out value="${row.task_id}"> </c:out>: <c:out value="${row.title}"> </c:out></br>
	</c:forEach>
	
	
	
</body>
</html>
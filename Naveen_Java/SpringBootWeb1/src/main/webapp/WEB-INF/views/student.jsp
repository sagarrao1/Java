<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Home Page</title>
    </head>
<body>
    <h1>Welcome to the Home Page</h1>
    <p>This is the main page of the application.</p>

    <form action="addStudent" method="post">
        <label for="id">Enter id:</label>
        <input type="text" id="id" name="id">
        <label for="name">Enter name:</label>
         <input type="text" id="name" name="name">
        <button type="submit">Submit</button>
    </form>
</body>
</html>

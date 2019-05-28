package com.learning;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//JSTL --> Jsp Standard Tag Library
		
		List<Student> studs= Arrays.asList(new Student(1,"Sagar"),new Student(2,"Bhavika"),new Student(3,"Sanju"));
		//Student s= new Student(1,"Sagar");
		
		req.setAttribute("students", studs);
		RequestDispatcher rd= req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
	}

}

package com.simple;

import java.io.IOException;
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

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
		String name="Sagar";
		
		List<Student> studs= Arrays.asList(new Student(1,"Sanju"), 
															 new Student(2,"Suresh"), 
															 new Student(3,"Ramu"), 
															 new Student(4,"Manoj"));
		//Student s= new Student(1, "sagar rao"); 
		
		req.setAttribute("students", studs);
		RequestDispatcher rd= req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
		
		
	}
	
}

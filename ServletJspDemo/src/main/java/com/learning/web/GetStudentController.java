package com.learning.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learning.web.dao.StudentDao;
// Servlet implementation class GetStudentController
import com.learning.web.model.Student;
 
public class GetStudentController extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			int sid= Integer.parseInt(request.getParameter("sid"));
			
			StudentDao dao= new StudentDao();			
			Student s1= dao.getStudent(sid);
			
		/*
		 * request.setAttribute("student", s1); RequestDispatcher rd =
		 * request.getRequestDispatcher("DisplayStudent.jsp"); rd.forward(request,
		 * response);
		 */
			
		HttpSession session = request.getSession();
		session.setAttribute("student", s1);
		response.sendRedirect("DisplayStudent.jsp");
		
			
	}
		
}

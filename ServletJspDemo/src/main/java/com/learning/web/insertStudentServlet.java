package com.learning.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.web.dao.StudentDao;

public class insertStudentServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int stid= Integer.parseInt(request.getParameter("stid"));
		String sname= request.getParameter("sname");
		String stechno= request.getParameter("stechno");
	   
		StudentDao dao= new StudentDao();
		
		if (stid !=0) {
			dao.insertStudent(stid, sname, stechno);
			response.sendRedirect("insertSuccess.jsp");
		}
	
	}

}

package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname= request.getParameter("uname");
		String pass	= request.getParameter("pass");
		
		CustomerLoginDao dao= new CustomerLoginDao();
		//CustomerLogin l= dao.getCustDetails(uname,pass);
		
		if (dao.checkCustDetails(uname, pass))
		//if (uname.equals(l.getUname()) && pass.equals(l.getPassword())) 
		{
			HttpSession session = request.getSession(); 
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		} 
	  else {			  
			response.sendRedirect("login.jsp"); 
		}
			 
		 
	}
}

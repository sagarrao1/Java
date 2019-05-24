package com.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*	this is for using ServletConfig & ServletContext
*/

public class MyServlet extends HttpServlet {

		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("Hi <br>");
			
			ServletContext ctx = getServletContext();
			String str=ctx.getInitParameter("name");
			String str1=ctx.getInitParameter("Phone");
			out.println(str+"<br>");
			out.println("Your phone is : ");
			out.println(str1);
			out.println("<br><br>");
			
			// if you want set initial values at each servlet level , use servletConfig
			ServletConfig cg= getServletConfig();
			String strcg=cg.getInitParameter("name");
			out.println("Hi <br>"+strcg);
			
			
		}
}

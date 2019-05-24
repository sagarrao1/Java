package com.simple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session=req.getSession();
		
		int k = ((int) session.getAttribute("k"));
		//int k = Integer.parseInt(req.getParameter("k"));

		/*
		 * int k=0; Cookie cookies[]= req.getCookies();
		 * 
		 * for (Cookie c : cookies) { if (c.getName().equals("k")) {
		 * k=Integer.parseInt(c.getValue()); System.out.println("k value :"+k); } }
		 */
		
		int s = k * k;
		PrintWriter out = res.getWriter();
		out.println(" addition of numbers is  " + k);
		out.println(" square of the result is " + s);

		/*
		 * System.out.println("k value :"+k); session.removeAttribute("k"); // k =
		 * ((int) session.getAttribute("k")); System.out.println("k value 1 :"+k);
		 */
		
		// System.out.println(" this is square servlet");
	}
}

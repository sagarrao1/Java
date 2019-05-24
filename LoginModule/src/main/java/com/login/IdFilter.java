package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
public class IdFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In Id Filter  pass through");
		
		HttpServletRequest req= (HttpServletRequest) request;
		
		
		PrintWriter out = response.getWriter(); 
				
		String uname= req.getParameter("uname");
		
		if (uname.length()>3) {		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		} else {
				out.println(" Invalid data");
		}
			
	}
}

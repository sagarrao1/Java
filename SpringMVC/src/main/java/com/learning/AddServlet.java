package com.learning;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.service.AddService;

@Controller
public class AddServlet {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,  @RequestParam("t2") int j,   HttpServletRequest request, HttpServletResponse response ) {
		
		
//		  int i= Integer.parseInt(request.getParameter("t1")); 
//		  Integer.parseInt(request.getParameter("t2"));
		 		
		AddService as = new AddService();
		int k = as.add(i, j);
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
		//return "display.jsp";
		//System.out.println(" in add() method");
	}

}

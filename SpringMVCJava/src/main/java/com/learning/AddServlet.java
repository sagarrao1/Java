package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddServlet {
	
	@RequestMapping("/add")
	public ModelAndView  add(@RequestParam("t1") int num1,  @RequestParam("t2") int num2 ) {	
		
		int k= num1+num2;	
		
		ModelAndView mv=  new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		return mv;
	}
	
}

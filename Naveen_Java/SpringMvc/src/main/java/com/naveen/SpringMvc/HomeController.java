package com.naveen.SpringMvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.naveen.SpringMvc.dao.AlianDao;
import com.naveen.SpringMvc.model.Alian;

@Controller
public class HomeController {
	
	@Autowired
	private AlianDao dao;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home controller page requested");		
		return "index";
	}
	
	
	@ModelAttribute
	public void methodData(Model m) {
		
		m.addAttribute("name" , "Alians.");		
	}
	
//	type 1 : using get param and seeting value in session
//	@RequestMapping("add")
//	public String add(HttpServletRequest req) {
//		
//		int i= Integer.parseInt(req.getParameter("num1"));
//		int j= Integer.parseInt(req.getParameter("num2"));
//		
//		int num3= i+j;		
//		HttpSession session= req.getSession();
//		session.setAttribute("num3", num3);
//		
//		return "result.jsp";
//	}

// type 2 : using request param
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpSession session) {
//		int num3= i+j;		
//		session.setAttribute("num3", num3);
//		
//		return "result.jsp";
//	}

//	type 3 : using ModelAndView
//	model will have data and view will have jsp
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
//		ModelAndView mv = new ModelAndView();		
//		mv.setViewName("result.jsp");
//		
//		int num3= i+j;				
//		mv.addObject("num3", num3);
//		
//		return mv;
//	}

//	type 4 : adding prefix and suffix in application.properties
//	search spring boot application properties in google
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("result");
		
		int num3= i+j;				
		mv.addObject("num3", num3);
		
		return mv;
	}

	
//	@RequestMapping("addAlian")
//	public String add(@RequestParam("aid") int aid,@RequestParam("aname") String aname, Model m) {
//
//		Alian a = new Alian();
//		
//		a.setAid(aid);
//		a.setAname(aname);
//
//		m.addAttribute("alian", a);
//		
//		return "result";		
//	}

	
// using model attribute
	@RequestMapping("addAlian")
	public String add(@ModelAttribute("result") Alian a) {
		
		dao.addAlian(a);		
		return "showAlians";
	}
	
	
//  Getting data from mysql DB using dao layer	
	@GetMapping("getAlian")
	public String getalain(@RequestParam("aid") int aid,  Model m) {
		
		m.addAttribute("result", dao.getAlian(aid));
		return "showAlians";
		
	}
	
	
//   Getting data from mysql DB using dao layer	
	@GetMapping("getAlians")
	public String getalains(Model m) {		
		m.addAttribute("result", dao.getAlians());
		return "showAlians";
		
	}
	
	
}

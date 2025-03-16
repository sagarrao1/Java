package com.naveen.SpringMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.number.NumberStyleFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.naveen.SpringMvc.dao.AlianDao;
import com.naveen.SpringMvc.model.Alian;

import javassist.expr.NewArray;

@Controller
public class HomeController {
	
	@Autowired
	private AlianDao dao;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home controller page requested");
//		return "indexAdd";  // adding 2 Numbers index page
		return "index";
	}
	
// add start -------------------------------------	

	
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
//	System.out.println("Using HttpServletRequest to get parameters");
//		
////		return "result.jsp"; // we have added internal view resolver in front controller for prefix and suffix
//		return "result";
//	}

// type 2 : using request param
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, HttpSession session) {
//		int num3= i+j;		
//		session.setAttribute("num3", num3);
//		System.out.println("Using @RequestParam to get parameters");
//		return "result";
//	}

//	type 3 : using ModelAndView
//	model will have data and view will have jsp
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
		ModelAndView mv = new ModelAndView();		
//		mv.setViewName("result.jsp");
//		we have added internal view resolver in front controller for prefix and suffix		
		mv.setViewName("result");
		System.out.println("Using ModelAndView");
		int num3= i+j;				
		mv.addObject("num3", num3);
		
		return mv;
	}

//	type 4 : adding prefix and suffix in application.properties
//	search spring boot application properties in google
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j) {
//		ModelAndView mv = new ModelAndView();		
//		mv.setViewName("result");
//		
//		int num3= i+j;				
//		mv.addObject("num3", num3);
//		
//		return mv;
//	}

// add numbers end ----------------------------------------
	
	
//	 Type 1 Add Alian
	
//	@RequestMapping("addAlian")
//	public String add(@RequestParam("aid") int aid,@RequestParam("aname") String aname, Model m) {
//
//		Alian a = new Alian();
//		
//		a.setAid(aid);
//		a.setAname(aname);
//
//		m.addAttribute("alian", a);
//		System.out.println("Type 1 addAlian ");
//		return "result";		
//	}

//	 Type 2 Add Alian using Model attribute	
//	@RequestMapping("addAlian")
//	public String add(@ModelAttribute Alian a, Model m) {
//		m.addAttribute("alian", a);
//		System.out.println("Type 2 using Model attribute ");
//		return "result";		
//	}

////	Type 3 Add Alian using Model attribute	accepts parameter
/// without DAO
//	@RequestMapping("addAlian")
//	public String add(@ModelAttribute("a1") Alian a) {
//		System.out.println("Type 3 using Model attribute accepts parameter a1. result will have a1 ");
//		return "result";		
//	}
	
//	Type 4 Create Model Attribute at method level add attributes , you can fetch name in result.jsp
//	Welcome back ${name}  is result.jsp	
	@ModelAttribute
	public void methodData(Model m) {
		
		m.addAttribute("name" , "Alians.");		
	}
	
	//	
// using model attribute
	@RequestMapping("addAlian")
	public String add(@ModelAttribute("result") Alian a) {
		
		dao.addAlian(a);		
		System.out.println("Add Alian using DAO");
		return "showAlians";
	}

	
//	Getting data from local List, not from DB	
//	@GetMapping("getAlians")
//	public String getalains( Model m) {
////		Alian a1 = new Alian(10001, "Sagar rao from List");		
//
//		List<Alian> alians = Arrays.asList(
//				new Alian(1, "Murali"),
//				new Alian(2, "Sravan"));
//		
//		m.addAttribute("result", alians);
//		return "showAlians";
//		
//	}
	
	
	
//  Getting data from mysql DB using dao layer	
	@GetMapping("getAlian")
	public String getAlian(@RequestParam int aid, Model m) {
		m.addAttribute("result", dao.getAlian(aid));		
		return "showAlians";
	}
	
	
//   Getting data from mysql DB using dao layer	
	@GetMapping("getAlians")
	public String getalains(Model m) {		
		m.addAttribute("result", dao.getAlians());
		return "showAlians";
		
	}
	
	@GetMapping("getAlianByName")
	public String getAlianByName(@RequestParam String aname, Model m) {
		m.addAttribute("result", dao.getAlianByName(aname));		
		return "showAlians";
	}
	
	
}

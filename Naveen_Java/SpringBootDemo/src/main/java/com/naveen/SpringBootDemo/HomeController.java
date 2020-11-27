package com.naveen.SpringBootDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.naveen.SpringBootDemo.model.Alian;

@Controller
public class HomeController {
	
	
	@Autowired
	private AlianRepo repo;
		
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
//	@RequestMapping(value="addAlian", method = RequestMethod.POST)
	@PostMapping(value="addAlian")
	public String add(@ModelAttribute("result") Alian a) {		
		repo.save(a);		
		return "showAlians";
	}
	
	@GetMapping(value="getAlians")
	public String getAlians(Model m) {
		
		List<Alian> alians = repo.findAll(); 
		
		m.addAttribute("result", alians);
		
		return "showAlians";
	}

	@GetMapping(value="getAlian")
	public String getAlian(@RequestParam("aid") int aid, Model m) {
		
//		Optional<Alian> alian = repo.findById(aid);
		
		m.addAttribute("result", repo.getOne(aid));
		
		return "showAlians";
	}
	
	@GetMapping(value="getAlianByName")
	public String getAlian(@RequestParam String aname, Model m) {
		
//		List<Alian> alians= repo.findByAnameOrderByAidDesc(aname);
		List<Alian> alians= repo.find(aname);
		
		m.addAttribute("result", alians);
		
		return "showAlians";
	}
	
	@GetMapping(value="removeAlian")
	public String removeAlian(@RequestParam("aid") int aid, Model m) {
		
		repo.deleteById(aid);		
		m.addAttribute("result", aid+" removed" );		
		return "showAlians";
	}

}

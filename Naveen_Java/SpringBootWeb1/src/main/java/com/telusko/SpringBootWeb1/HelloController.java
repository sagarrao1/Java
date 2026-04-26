package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Controller called..");
        return "index";
    }


//    1. Using HttpServletRequest and HttpSession
//    @RequestMapping("/add")
//    public String add(HttpServletRequest  request, HttpSession session) {
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        System.out.println("add Controller called.. num1: " + num1+" num2: " + num2);
//        int result = num1 + num2;
//        System.out.println("result: " + result);
//
//        session.setAttribute("result", result);
//
//        return "result";
//    }

//    2. Using @RequestParam
@RequestMapping("/add")
public ModelAndView add(@RequestParam int num1, @RequestParam int num2, ModelAndView mv) {
    System.out.println("add Controller called.. num1: " + num1+" num2: " + num2);
    int result = num1 + num2;
    System.out.println("result: " + result);

    mv.addObject("result", result);
    mv.setViewName("result");

    return mv;
}

    @RequestMapping("/student")
    public String student() {
        System.out.println("student Controller called..");
        return "student";
    }

    @RequestMapping("/addStudent")
    public String add(@ModelAttribute("student1") Student student, ModelAndView mv) {

//        mv.addObject("student1", student);
//        mv.setViewName("studentResult");
//        return mv;

        return "studentResult";
    }

    @ModelAttribute("course")
    public String courseName() {
        System.out.println("course Controller called..");
        return "java";
    }

}
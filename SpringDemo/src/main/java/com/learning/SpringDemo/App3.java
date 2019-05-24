package com.learning.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Laptop lp = context.getBean(DellLaptop.class);
		Student s= context.getBean(Student.class);
		//s.setLp(lp);
		s.show();

	}

}

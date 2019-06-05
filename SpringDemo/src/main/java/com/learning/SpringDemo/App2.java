package com.learning.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring core Annotations
public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7=  factory.getBean(Samsung.class);
		s7.config();

	}

}

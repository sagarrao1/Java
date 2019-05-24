package com.learning.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.learning.SpringDemo")
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone() {
//		Samsung s = new Samsung();
//		return s;
//	}
//	
//	@Bean
//	public MobileProcesser getProcessor() {
//		return new Snapdragon();
//	}
	
//	@Bean
//	public Student getStudent() {
//		return new Student();
//	}
}

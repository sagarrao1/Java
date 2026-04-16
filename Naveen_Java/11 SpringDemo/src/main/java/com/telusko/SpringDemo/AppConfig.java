package com.telusko.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


//@Configuration
//public class AppConfig {
//
//    @Bean
//    public Student student(@Qualifier("com1") Computer com) {  //@Autowired
//        Student student = new Student();
//        student.setAge(25);
//        student.setCom(com);
//        return student;
//    }
//
//    @Bean(name = "com1")
//    public Laptop lap() {
//    	return new Laptop();
//    }
//
//    @Bean(name="com2")
////    @Primary
////    @Scope("prototype")
//    public Desktop desktop1() {
//    	return new Desktop();
//    }
//}

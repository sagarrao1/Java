package com.telusko.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppDemoAnnotationBased
{
    public static void main( String[] args )
    {
    	
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);

    	Student obj1 = (Student)context.getBean("student", Student.class);
		System.out.println(obj1.getAge());
		obj1.code();


//		Computer com= (Computer)context.getBean("lap");

//        Desktop com2 = context.getBean("com2",Desktop.class);
//        com2.compile();

//        Desktop com1 = context.getBean("com2",Desktop.class);
//        com1.compile();


    	context.close();
    	
    	    	 
    	
    }
}


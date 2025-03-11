package com.telusko.SpringDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Alien obj1 = (Alien)context.getBean("alien");
    	obj1.code();
    	
    	System.out.println(obj1.getAge());
    	
    	
    	context.close();
    	
    	    	 
    	
    }
}

package com.learning.SpringAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Aspect Oriented programming
//cross cutting concerns  --> Aspect
// Advice  --> What    --> Before ,After
//Pointcut   --> Where

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	//@Before("execution(public void show())")
	@After("execution(public void show())")
	public void log() {
		
		System.out.println(" logging show() method");
	}

}

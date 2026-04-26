package com.telusko._SpringBootDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com2")
@Scope("prototype")
public class Desktop implements Computer
{
	public Desktop() {
		System.out.println("Desktop Object Created.. ");
	}

	public void compile() 
	{
		System.out.println("Code Compiled in a Desktop");
	}
}
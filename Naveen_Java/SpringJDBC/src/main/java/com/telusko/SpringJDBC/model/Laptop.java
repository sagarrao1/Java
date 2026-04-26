package com.telusko.SpringJDBC.model;

import org.springframework.stereotype.Component;

//@Component("com1")
public class Laptop implements Computer
{

	public Laptop() {
		System.out.println("laptop Object Created.. ");
	}

	public void compile()
	{
		System.out.println("Code Compiled in a Laptop");
	}

	@Override
	public String toString() {
		return "Laptop{}";
	}
}

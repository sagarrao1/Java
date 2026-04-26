package com.telusko.SpringJDBC.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Alien {
	@Value("26")
	private int age;
	private Computer com;

	public Alien() {
		System.out.println("Alien Object Created..");
	}

	public Computer getCom() {
		return com;
	}

	@Autowired
	@Qualifier("com1")
	public void setCom(Computer com) {
		System.out.println("Setter injecttion. com Assigned");
		this.com = com;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter injecttion. Age Assigned");
		this.age = age;
	}

	public void code() {
		System.out.println("Im Coding..");
		com.compile();
	}

	public Alien(Computer com, int age) {
		this.com = com;
		this.age = age;
	}

	public Alien(int age) {
		System.out.println("Constructor injection. age assigned");
		this.age = age;
	}
	
	
}

package com.telusko.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

//	we can use @Value to get value from properties fil	e as well. we just need to add @PropertySource in AppConfig class and then we can use @Value to get the value from properties file.
	@Value("25")
	private int age;
	private Computer com;

	public Student() {
		System.out.println("Student Object Created..");
	}

	public Computer getCom() {
		return com;
	}

//	setter injection
	@Autowired
	@Qualifier("com2")
	public void setCom(Computer com) {
		this.com = com;
	}

	public Student(Computer com) {
		this.com = com;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Student Setter injecttion. Age Assigned");
		this.age = age;
	}

	public void code() {
		System.out.println("Student code method. Im Coding..");
		com.compile();
	}

	public Student(int age) {
		System.out.println("Student Constructor injection. age assigned");
		this.age = age;
	}
	
	
}

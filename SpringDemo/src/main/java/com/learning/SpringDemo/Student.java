package com.learning.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	@Qualifier("hpLaptop")
	Laptop lp;
	
	public Laptop getLp() {
		return lp;
	}
	
	public void setLp(Laptop lp) {
		this.lp = lp;
	}

	public void show() {
		System.out.println(" Student show ......");
		lp.features();
	}

}

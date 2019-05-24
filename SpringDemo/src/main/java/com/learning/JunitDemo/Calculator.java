package com.learning.JunitDemo;

public class Calculator {
	
	CalculatorService service;
	
	
	public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}


	public int perform (int i, int j) {
		
		return service.add(i, j)*i;
		//return (i+j)*i;
	}
}

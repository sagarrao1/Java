package com.learning.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;
	
	/*// Constructor
	 * public Tyre(String brand) { super(); 
	 * this.brand = brand; }
	 */

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "in Tyre. It's working";
	}
	
	
}

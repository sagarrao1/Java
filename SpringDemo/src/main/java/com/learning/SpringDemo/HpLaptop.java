package com.learning.SpringDemo;

import org.springframework.stereotype.Component;

@Component                                            
public class HpLaptop implements Laptop {

	public void features() {
		System.out.println(" HP Laptop : i5 Windows 10  8 GB ram 256GB SSD");
		
	}

}

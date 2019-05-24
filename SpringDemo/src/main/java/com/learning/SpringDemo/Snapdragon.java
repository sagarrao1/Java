package com.learning.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcesser {

	public void process() {
		System.out.println("Best mobile processer (CPU) .....................");
		
	}

}

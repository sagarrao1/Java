package com.learning.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
 @Primary 
public class Mediatek implements MobileProcesser {

	public void process() {
		System.out.println(" 2nd Best CPU is mediaTek .......");
		
	}

}

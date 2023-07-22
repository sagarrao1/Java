package com.paolo.oops.pkg3;

public class PrioritizedAlarmMain {

	public static void main(String[] args) {
		PrioritizedAlarm p = new PrioritizedAlarm("Temparature", 42);
		p.turnOn();
		p.sendReport();
		System.out.println(p.getPriority());		
		
	}

}

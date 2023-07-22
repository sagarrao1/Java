package com.paolo.oops.pkg1;

public class AlaramMain {

	public static void main(String[] args) {
		Alarm alarm = new Alarm("Temperature is too high");
		alarm.turnOn();
		alarm.sendReport();
//		it won't work as used final on message member in Alarm class
//		alarm.message="message updated";
//		alarm.sendReport();
		
		Alarm alarm1 = new Alarm();
		alarm1.sendReport();
	}

}

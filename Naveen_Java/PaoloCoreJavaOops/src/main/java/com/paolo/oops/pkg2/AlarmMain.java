package com.paolo.oops.pkg2;

public class AlarmMain {

	public static void main(String[] args) throws InterruptedException {
		Alarm alarm = new Alarm("Temparature is too high");
		alarm.turnOn();
		alarm.snooze();
		Thread.sleep(6000 * 3);
		alarm.sendReport();
		
	}

}

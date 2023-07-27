package com.paolo.oops.interfaceAbstract;

public class Main {

	public static void main(String[] args) {
		Alarm alarm = new HightVisibilityAlarm("Temperature high ");
//		alarm.turnOn();
//		alarm.sendReport();		
//		System.out.println(alarm.getColor());
		
		showAlarmStatus(alarm);
		
		alarm = new PrioritizedAlarm("Temperature low ", 23);
//		alarm.turnOn();
//		alarm.sendReport();		
//		System.out.println(alarm.getColor());
		showAlarmStatus(alarm);
	}
	
	public static void showAlarmStatus(Alarm alarm) {
		alarm.turnOn();
		alarm.sendReport();		
		System.out.println(alarm.getColor());
	}

}

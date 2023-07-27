package com.paolo.oops.polymorphism;

import com.paolo.oops.inheritence.PrioritizedAlarm;
import com.paolo.oops.pkg2.Alarm;

public class Main {

	public static void main(String[] args) {
				
		Alarm alarm = new PrioritizedAlarm("Prioritized Alarm", 2);
//		PrioritizedAlarm alarm = new PrioritizedAlarm("Prioritized Alarm", 2);
		alarm.turnOn();
//		System.out.println(alarm.getReport(true));
//		alarm.sendReport();
		showAlarmStatus(alarm);
//		alarm.getPriority();
		
	}
	
	public static void showAlarmStatus(Alarm alarm) {
		System.out.println("Active : " + alarm.getActive());
		System.out.println("Snoozing : " + alarm.isSnoozing());
		alarm.sendReport();
		
	}

}

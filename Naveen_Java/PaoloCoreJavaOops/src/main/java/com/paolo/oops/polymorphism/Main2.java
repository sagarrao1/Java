package com.paolo.oops.polymorphism;

import com.paolo.oops.inheritence.HightVisibilityAlarm;
import com.paolo.oops.inheritence.PrioritizedAlarm;
import com.paolo.oops.pkg2.Alarm;

public class Main2 {

	public static void main(String[] args) {
		Alarm alarm = new HightVisibilityAlarm("High visibility Alarm");
//		HightVisibilityAlarm alarm = new HightVisibilityAlarm("High visibility Alarm");
		alarm.turnOn();
		showAlarmStatus(alarm);
		
	}
	
	public static void showAlarmStatus(Alarm alarm) {
		System.out.println("Active : " + alarm.getActive());
		System.out.println("Snoozing : " + alarm.isSnoozing());
		alarm.sendReport();
		
	}

}

package com.paolo.oops.polymorphism;

import java.util.ArrayList;
import java.util.List;

import com.paolo.oops.inheritence.HightVisibilityAlarm;
import com.paolo.oops.inheritence.PrioritizedAlarm;
import com.paolo.oops.pkg2.Alarm;

public class Dashboard {	
	
	private final List<Alarm> allAlarms = new ArrayList<Alarm>();	
	
	public void add(Alarm alarm) {
		alarm.turnOn();
		allAlarms.add(alarm);
	}	
	
	public void printBigReport() {
		for (Alarm alarm : allAlarms) {
			System.out.println(alarm.getReport(true));
		}
	}
	

	public static void main(String[] args) {
		Dashboard dashboard = new Dashboard();
		dashboard.add(new PrioritizedAlarm("Pressure is high", 0));
		dashboard.add(new HightVisibilityAlarm("Pressure is low"));
		dashboard.add(new TimeSensitiveAlarm("Pressure is low"));
		
		dashboard.printBigReport();
	}
}

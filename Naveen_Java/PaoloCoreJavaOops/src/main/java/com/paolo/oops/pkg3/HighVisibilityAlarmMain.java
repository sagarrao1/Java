package com.paolo.oops.pkg3;

public class HighVisibilityAlarmMain {

	public static void main(String[] args) {
		HightVisibilityAlarm h = new HightVisibilityAlarm("High visibility Alarm");
		System.out.println(h.getReport(true));
//		h.sendReport();
	}	
}

package com.paolo.oops.interfaceAbstract;

public class Main2 {

	public static void main(String[] args) {
		Alarm alarm = new HightVisibilityAlarm("Hello there ");
//		alarm.turnOn();
//		System.out.println(alarm.getHelpText());
//		alarm.save();
		activate(alarm);
		printText(alarm);
		saveTwice(alarm);		
	}
	
	private static void activate(Alarm alarm) {
		alarm.turnOn();
	}
	
	private static void printText(Widget widget) {
		System.out.println(widget.getHelpText());
	}
	
	private static void saveTwice(PersistentObject persistentObject) {
		persistentObject.save();
		persistentObject.save();
	}
	
	
}

// Adding Snoozing functionality to Alarm class

package com.paolo.oops.pkg2;

import java.time.LocalDateTime;

public class Alarm {

	protected boolean active;
	private final String message;
	private LocalDateTime snoozeUntil;	
	

//	public Alarm() {
////		this.message="default message";
//		this("default message");
//		stopSnoozing();
//	}

	public Alarm(String message) {
		this.message = message;
		stopSnoozing();
	}
	
	public void snooze() {
		if (active)
			snoozeUntil= LocalDateTime.now().plusSeconds(3);
	}
	
	public boolean isSnoozing() {
//		if (snoozeUntil.isAfter(LocalDateTime.now()))
//			return true;
//		else 
//			return false;
		return snoozeUntil.isAfter(LocalDateTime.now());
	}

	private void stopSnoozing() {
		snoozeUntil = LocalDateTime.now().minusMinutes(1);
	}
	
	public void turnOn() {
		this.active = true;
		stopSnoozing();
	}

	public void turnOff() {
		this.active = false;
		stopSnoozing();
	}
	
	public String getReport() {
		return getReport(false);
	}

	public String getReport(Boolean upperCase) {
		if (active && !isSnoozing() ) {
			if (upperCase )
				return message.toUpperCase();
			else
				return message;
		} else {
			return "";
		}
	}

	public void sendReport() {
		System.out.println(getReport(true));
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getSnoozeUntil() {
		return snoozeUntil;
	}

	

}

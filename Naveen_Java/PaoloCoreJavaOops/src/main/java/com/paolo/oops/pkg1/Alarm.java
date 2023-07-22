package com.paolo.oops.pkg1;

public class Alarm {

	boolean active;
	final String message;

	public Alarm() {
//		this.message="default message";
		this("default message");
	}

	public Alarm(String message) {
		this.message = message;
	}

	public void turnOn() {
		this.active = true;
	}

	public String getReport() {
		return getReport(true);
	}

	public String getReport(Boolean upper) {
		if (active == true) {
			if (upper == true)
				return message.toUpperCase();
			else
				return message;
		} else {
			return "";
		}
	}

	public void sendReport() {
		System.out.println(getReport());
	}

}

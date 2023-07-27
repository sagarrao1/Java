package com.paolo.oops.polymorphism;

import java.time.LocalDateTime;

import com.paolo.oops.pkg2.Alarm;

public class TimeSensitiveAlarm extends Alarm{

	public TimeSensitiveAlarm(String message) {
		super(message);
	}
	
	@Override
	public String getReport(Boolean upperCase) {
		String report = super.getReport(upperCase);		
		if (report.isEmpty())
		   return report;
		else
			return LocalDateTime.now() + " : "+  report ;
	}


}

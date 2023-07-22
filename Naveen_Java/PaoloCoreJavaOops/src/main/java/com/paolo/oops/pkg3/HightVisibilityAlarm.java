package com.paolo.oops.pkg3;

import com.paolo.oops.pkg2.Alarm;

public class HightVisibilityAlarm extends Alarm{

	public HightVisibilityAlarm(String message) {
		super(message);
	}
	
	@Override
	public String getReport(Boolean upperCase) {

//			if (active && !isSnoozing() ) {
//				if (upperCase )
//					return getMessage().toUpperCase() + " !! ";
//				else
//					return getMessage() + " !! ";
//			} else {
//				return "";
//			}
		
// another way no duplication with super class method 
		String report = super.getReport(upperCase);
		
		if (report.isEmpty())
		   return report;
		else
			return report + " !!! ";
	}


	public static void main(String[] args) {
		HightVisibilityAlarm h = new HightVisibilityAlarm("High visibility Alarm");
		h.turnOn();
		System.out.println(h.getReport(true));
		h.sendReport();
	}	

}

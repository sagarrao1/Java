package com.paolo.oops.interfaceAbstract;

import java.awt.Color;

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

	@Override
	public Color getColor() {
		return Color.GREEN;
	}
	
//	@Override
//	public String getHelpText() {
//		return "This is high visibility Alarm help text";
//	}

}

package com.paolo.oops.inheritence;

import com.paolo.oops.pkg2.Alarm;

public class PrioritizedAlarm extends Alarm{
	
	private int priority;

	public PrioritizedAlarm(String message, int priority) {
		super(message);
		this.priority=  priority;
	}

	public int getPriority() {
		return priority;
	}
	
	

}

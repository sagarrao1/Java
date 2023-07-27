package com.paolo.oops.interfaceAbstract;

import java.awt.Color;

public class PrioritizedAlarm extends Alarm{
	
	private int priority;

	public PrioritizedAlarm(String message, int priority) {
		super(message);
		this.priority=  priority;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public Color getColor() {
		return Color.RED;
	}
	
	

}

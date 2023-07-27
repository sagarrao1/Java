package com.paolo.oops.polymorphism;

import com.paolo.oops.inheritence.PrioritizedAlarm;
import com.paolo.oops.pkg2.Alarm;

public class Downcasting {

	public static void main(String[] args) {
		Alarm alarm = new PrioritizedAlarm("Prioritized  Alarm", 33);

//		to avoid class cast exception
		if (alarm instanceof PrioritizedAlarm) {
//			inorder to use getPriority() we need to downcast alarm		
			PrioritizedAlarm pAlarm = (PrioritizedAlarm) alarm;
			System.out.println(pAlarm.getPriority());
		}
	}

}

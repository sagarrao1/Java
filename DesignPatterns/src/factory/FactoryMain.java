package factory;

import com.phone.*;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf= new OperatingSystemFactory();
		OS obj1=osf.getInstance("Closed");
		obj1.spec();
	}

}

package builderDesign;

public class PhoneBuilder {
	
	private String os;
	private int battery;
	private double screenSize;	
	private int camera;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}	
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;		
		return this;
	}	
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}	
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	
	
	  public Phone getPhone() { 
		  return new Phone(os, battery, screenSize, camera);
		  
    }
	 
	

}

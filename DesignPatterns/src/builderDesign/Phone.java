package builderDesign;

//Builder pattern
public class Phone {
	
	private String os;
	private int battery;
	private double screenSize;	
	private int camera;
	
	
	public Phone(String os, int battery, double screenSize, int camera) {
		this.os = os;
		this.battery = battery;
		this.screenSize = screenSize;
		this.camera = camera;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", battery=" + battery + ", screenSize=" + screenSize + ", camera=" + camera + "]";
	}
	
	
}

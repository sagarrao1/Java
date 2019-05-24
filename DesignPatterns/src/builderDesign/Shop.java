package builderDesign;

public class Shop {

	public static void main(String[] args) {
		//Phone p = new Phone("Andriod",3100,4.23,12);
		//Phone p= new PhoneBuilder().setBattery(3000).setOs("Andriod").setCamera(12).getPhone();
		//System.out.println(p);
		
		PhoneBuilder p= new PhoneBuilder().setBattery(4100);
		//p.setBattery(4200);
		Phone ph= p.getPhone();
		System.out.println(ph);

	}

}

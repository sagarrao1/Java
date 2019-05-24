package chapter15;

public class PhoneDemo {

	public static void main(String[] args) {
		//Phone p= new SmartPhone();
		//p.show();
		
		/* Phone p=new Phone() {
			@Override
			public void show() {
				System.out.println("I can Call");
				System.out.println("I can take photo");
				System.out.println("I can send message");
			}	
		}; */
		//p.show();
		
		//Lambda expression in 1.8
		Phone1 p=() -> {
				System.out.println("I can Call");
				System.out.println("I can take photo");
				System.out.println("I can send message");				
		};
		
		p.show();

		
	}

}

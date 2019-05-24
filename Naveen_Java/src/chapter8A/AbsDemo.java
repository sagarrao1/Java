package chapter8A;

public class AbsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone obj=new Iphone();
		SamsungS4 obj1=new SamsungS4();
		show(obj);
		//obj1.showConfig();
		
		Phone obj2=new Iphone();
		obj2.showConfig();

		Phone obj3=new SamsungS4();
		obj3.showConfig();
	}
	
	public static void show(Phone obj) {
		obj.showConfig();	
	}
	
}

abstract class Phone{  // abstract class
	
	public void show() {
		System.out.println(" we can have normal method aswell in abstract class");
	}
	public abstract void showConfig();
}

class Iphone extends Phone  // concrete class
{
	public void showConfig() {
		//show();
		System.out.println("2GB IOS 9.3");
	}	
}

class SamsungS4 extends Phone // concrete class
{
	public void showConfig() {
		System.out.println("2GB Lolipop");
	}
}

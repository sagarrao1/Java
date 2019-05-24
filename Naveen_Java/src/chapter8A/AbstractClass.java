package chapter8A;

public class AbstractClass {
	// we can call sub class object with super class reference
	// abstract methods are those that are declared but not defined. 
	//not implemented fully by declaring classs
	// it's job to define methods of class that is extending that abstract class
	// if any of method is abstract then you need to declare that class as abstract classs
	//but if the class is abstract that may or may not have abstract methods
	// you cannot create objects of abstract class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MaheshPhone obj= new SureshPhone();    // can not instantiate abstract class
		 // we can call sub class object using super class reference
		obj.call();
		obj.dance();
		obj.move();
		obj.cook();
	}
}

// MRS

 abstract class MaheshPhone{   // abstract class
	public void call() {
		System.out.println("Calling ....");
	}
	
	public abstract void move();   // abstract methods
	public abstract void dance();  
	public abstract void cook();	
}

abstract class RameshPhone extends MaheshPhone{
	public void move() {
		System.out.println("Moving.....");
	}
	public void dance() {
		System.out.println("Dancing .....");
	}
}
class SureshPhone extends RameshPhone{   // concrete class
	public void cook() {
		System.out.println("Cooking.....");
	}
}

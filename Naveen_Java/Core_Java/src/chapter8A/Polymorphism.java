package chapter8A;
/* Polymrphism is many behaviours for one method
 *  1. method overloading
 *  2. method overriding
 *  3.constructor overloading
 * 
 * Method over
 */

public class Polymorphism {
	public static void main(String[] args) {
		//X obj=new X();
		//obj.show(5);
		
		/*// method overriding example
		 * Sub obj=new Sub(); obj.show()
		 */;
		 
		 // Dynamic method dispath or Runtime polymorphism
		 Abc obj1= new Abc();
		 Sub obj2=new Sub();
		 
		 //obj1.show();
		 //obj2.show();
		 
		 Abc a;
		 a=obj2;
		 a.show(); //does not matter what is referencing, what it matters is which object it
		 
		 Abc b= new Sub();
		 b.show();
	}
}

class X{  //Method overload is also called as
	// Early binding, static binding, compile time polymorphism
	public void show() {
		System.out.println("Hello");
	}
	
	/*
	 * public void show(int i) { System.out.println("Hello int "+ i); }
	 */
	public void show(double i) {
		System.out.println("Hello double "+ i);
	}
}
	// Method overriding example with inheritence
   // it is also called as late binding, dynamic binding, Run Time Polymorphism
   class Abc{
	   public void show()
	   {
		System.out.println("In abc show()");   
	   }
	   
   }
   
   class Sub extends Abc
   {
	   public void show() {
		   System.out.println("In Sub show()");
	   }
   }


package chapter8A;
/* when we instantiate sub class , it calls super class default constructor before 
   subclass constructor is called
   
   whenever you create object of subclass , you also get object of super class
   if u call subclass constructor, it calls super class constructor.
   
   every class has super class Object by default 
 */

public class InheritenceContructor {
	public static void main(String[] args) {
		A obj=new B(5);
	}
}

class A{		
	public  A() {		
		System.out.println("A's constructor");
	}
	 public A(int i) 
	 { 
		 System.out.println("A's constructor with Int "); 
     }	 
}

class B extends A
   {		
	public  B() {		
		System.out.println("B's constructor");
	}
	 public B(int i) 
	 { 		 
		 System.out.println("B's constructor with Int "); 
     }	 
}

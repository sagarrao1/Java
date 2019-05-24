package chapter8A;
public class SuperDemo {
	public static void main(String[] args) {
		Q obj=new Q();
		obj.test();

	}
}
// By default it calls Super class Default constructor
class P   //extends Object//       Super class
{
	public P() {
		//super();
		System.out.println("In Constructor P");
	}
	public P(int i) {
		//super();
		System.out.println("In Constructor P param i "+i);
	}
	
	public void test () {
		//super();
		System.out.println("In P test");
	}
	
}
class Q  extends P// Sub class
{
	public Q() {
		//super();
		System.out.println("In Constructor Q");
	}
	public Q(int i) {
		super(i);
		System.out.println("In Constructor Q param i "+i);
	}
	public void test () {
		super.test();
		System.out.println("In Q test");
	}
}


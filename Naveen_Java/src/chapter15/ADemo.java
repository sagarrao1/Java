package chapter15;

public class ADemo {

	public static void main(String[] args) {
		//A obj=new A();
		//obj.i=5;
		
		/*
		 * A.B obj1= obj.new B(); obj1.j=8;
		 */
		
		//System.out.println(obj.i);
		//System.out.println(obj1.j);

		A.i=18;		
		A.B obj1= new A.B();
		obj1.j=19;
		
		
	}

}

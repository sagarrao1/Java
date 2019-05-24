package chapter5;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method 1
		int a=5;
		int b=4;
		int temp;		
		temp=a;  //temp=5
		a=b;  //a=4 
		b=temp; //b=5
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("---------------method 2 -------");
		
		//method 2
		a=5;
		b=4;
		
		a=a+b; // 9
		b=a-b; //5
		a=a-b; //4
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
System.out.println("---------------method 3--------");
		//method 3 using bits
		a=5;   // 1 0 1
		b=4;  //  1 0 1		
		
		// ^ --> XOR   1^1 --> 0 , 1^0-->1,  0^1-->1, 0^0-->0
		a=a^b;  // 1 0 1 ^ 1 0 0 ---> 0 0 1
		b=a^b;  // 0 0 1 ^ 1 0 1 ---> 1 0 0  => 4
		a=a^b;  // 0 0 1 ^ 1 0 0 --->  1 0 1  => 5
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
System.out.println("---------------method 4 -------");
		
		//method 4
		a=5;
		b=6;
		b= a+b - (a=b);
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
				
	}

}

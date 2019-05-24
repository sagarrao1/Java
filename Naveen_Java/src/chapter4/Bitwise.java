package chapter4;

public class Bitwise {

	public static void main(String[] args) {
		int a=25;  // 1 1 0 0 1
		int b=15; //  0 1 1 1 1
		              //& 0 1 0 0 1    and
		              //|   1 1 1 1 1  or
		
		int c=0B01001;
		//System.out.println(Integer.toBinaryString(b));
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println("c= "+c);

	}

}

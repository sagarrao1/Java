package chapter4;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;      //  11001
		System.out.println(Integer.toBinaryString(a));
		int b= a<< 2; //  1100100
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println(b);
		//System.out.println(Integer.toBinaryString(b));
		
		int c= b>> 2;  // 11001
		
		System.out.println(Integer.toBinaryString(c));
		System.out.println(c);
		
	}

}

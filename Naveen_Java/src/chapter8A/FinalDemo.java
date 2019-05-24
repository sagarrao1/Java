package chapter8A;

public class FinalDemo {
	public static void main(String[] args) {
		// Final is used for variable, method and class
		
		//variable
		//final int i;
		//i=6;
		//System.out.println(i);
		
		// final method
		//S obj=new S();
		//obj.test();
		
		//final class
		// add final to class R so that we can not create sub class S from R
	}
}

/* final */ class R
{
	final public void test() {
		System.out.println("in R test()");
	}
}

class S extends R
{
	
	  //public void test() { System.out.println("In S test()"); }
	 
}
package chapter6;

import java.util.Arrays;

public class Varargs {
	public static void main(String[] args) {
		// varargs variable arguments
		Display d= new Display();
		d.show(5,6,7); 
		//it first checks for individual method, if it did not fine then it calls varargs method
	}
}
 class Display{
		public void show(int ... a) // variable arguments
		{
			for (int i : a) {
				System.out.println(i);
			}			
		}
		
	  public void show(int a,int b)
	  {
		  System.out.println(a+" show method"); 
		  System.out.println(b+ " show method");
	  }
	 

}


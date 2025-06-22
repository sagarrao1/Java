package chapter6;

import java.util.Iterator;

public class EnhancedForTwoD {

	public static void main(String[] args) {
		
		int p[][] = new int[3][4];
		
//		int p[][]= {  {1,2, 3,4},
//						  {5,6,7,8},
//						  {9,10,11,12}
//					  };
//		System.out.println(p.length );
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < 4; j++) {
//				System.out.print(p[i][j]+ " ");
				p[i][j] = (int) (Math.random()*10);
			}
//			System.out.println();
		}		
	  
	  System.out.println();
	  System.out.println("----enhnced for each for 2d array----");
	 for (int[] is : p) {		 
		 for (int v : is) {
			System.out.print(v+" ");
		}
		 System.out.println();
		
	 }
	}
}

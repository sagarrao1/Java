package chapter6;

import java.util.Random;

public class EnhancedForLoop {
	public static void main(String[] args) {
		Random r= new Random();
		int values[]=new int[20];
		
		for (int i = 0; i < values.length-2; i++) {
			values[i]=r.nextInt(20);
		}
		/*
		 * for (int i = 0; i < values.length; i++) { System.out.print(values[i]+" "); }
		 * System.out.println();
		 */
		try {
		System.out.println(values[22]);
		} catch (Exception e) {
			System.out.println("Maximun index value is "+(values.length-1));
		}
		//enhanced for loop
		for (int k : values) {
			System.out.print(k+" ");			
		}
		//System.out.println();
		//System.out.println(values[18]);
		
	}

}

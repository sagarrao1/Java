package chapter6;

import java.util.Random;

public class EhancedFor {
	public static void main(String[] args) {
		int num[]=new int[10];
		Random r=new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i]=r.nextInt(50);
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}

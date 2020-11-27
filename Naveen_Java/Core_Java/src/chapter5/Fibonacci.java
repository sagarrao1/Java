package chapter5;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value:");
		int n= s.nextInt();
		
		int k,a=1,b=1;
		k=0;
		 while(k<=n){			 
			 // 1 1 2 3 5 8 13 21
			  System.out.print(a+" ");			 
			 k=a+b;			 
			 //System.out.println("k="+k);
			 a=b;
			 b=k;
		 }
		

	}

}

package chapter9;

import java.util.Scanner;

// concatination of 2 strings , changing string 1 to upper, length of strings

public class StringOp {
	public static void main(String[] args) {
	String s1,s2;
	System.out.println("Enter 2 strings");
	Scanner sc= new Scanner(System.in);
	s1=sc.nextLine();
	s2=sc.nextLine();
	
	String s3= s1+s2;   //  s1.concat(s2);
	System.out.println("concatination of 2 strings : "+s3);
	
	System.out.println("Length of string 1: "+ s1.length());
	System.out.println("Length of string 2: "+ s2.length());
	
	System.out.println("Upper of string 1:"+ s1.toUpperCase());
	
	
	}
}

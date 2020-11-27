package chapter5;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		/*ArmStrong Number
		  153  1 5 3
		          1*1*1 + 5*5*5 + 3*3*3
		          1+125+27 = 153		 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number will tell whether it is ArmStrong or not: ");
		int n= sc.nextInt();
		int temp=n;
		int r,sum=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+ r*r*r;
		}
		if (sum==temp)
			System.out.println(temp+" is ArmStrong Number");
		else
			System.out.println(temp+" is Not");
	}
}

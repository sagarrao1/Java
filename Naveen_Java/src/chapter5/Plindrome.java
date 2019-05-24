package chapter5;
public class Plindrome {
	public static void main(String[] args) {
		/* 123 
		    321		    
		    123 is not palindrome
		    
		    121
		    121 is palindrome
		    
		    seperate each numer by mod u will get reminder as last digit
		    divide number by 10 so that digit will decrese by 1
		    multiply new number with 10 and add reminder;
		*/

		int n=121, r,s=0;
		int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if (t==s)			
			System.out.println(t +" is palindrome");
		else
			System.out.println(t +" is not palindrome");
	}

}

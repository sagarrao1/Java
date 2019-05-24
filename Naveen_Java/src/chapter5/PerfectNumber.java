package chapter5;
public class PerfectNumber {
	public static void main(String[] args) {
		int n=27;
		boolean b= isPerfect(n);
			if(b)
				System.out.println(n +" is Perfect Number");
			else
				System.out.println(n+" is Not");			
	}
	
	public static boolean isPerfect(int n) {
		  int sum=0;
		  for (int i = 1; i < n; i++) {
		     if(n%i==0)
		    	 sum=sum+i;
		}
		if(sum==n)
			return true;
		else
		  return false;
	}

}

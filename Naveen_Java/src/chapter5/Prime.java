package chapter5;
public class Prime {
	public static void main(String[] args) {
		/* Prime  is a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
			A prime number is a natural number greater than 1 that cannot be formed 
			by multiplying two smaller natural numbers. A natural number greater than 1
			 that is not prime is called a composite number. For example, 5 is prime because
			  the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself. */
		
		int num=1000;
		boolean isPrime=true;
		
		for (int i = 2; i < num/2; i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println(num+" is Prime Number");
			}
		else {
			System.out.println(num+" is Not Prime");
		}
			
		
	}

}

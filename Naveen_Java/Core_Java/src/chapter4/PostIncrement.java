package chapter4;

public class PostIncrement {

	public static void main(String[] args) {
		int i=5;
		int j=++i;
		
		// i++ post increment
		// ++i pre increment
		
		System.out.println("j= "+j);

		int k=5;
		k=k++;
		/* equals to 
		  int temp=k; 
		  k++; 
		 k=temp;
		 */
		 
		System.out.println("k= "+k);
			
	}

}

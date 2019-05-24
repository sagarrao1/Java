package chapter6;

public class EnhancedForTwoD {

	public static void main(String[] args) {
		int x[]= {1,2, 3,4};
		int y[]= {5,6,7,8};
		int z[]= {9,10,11,12};
		
		int p[][]= {  {1,2, 3,4},
						  {5,6,7,8},
						  {9,10,11,12}
					  };
	  for (int i : x) {
		System.out.print(i+" ");
	}	
	  System.out.println();
	  System.out.println("----enhnced for each for 2d array----");
	  for (int is[] : p) {
		  for (int v : is) {
			  System.out.print(v+" ");
		}
		  System.out.println(" ");
	}
	}
}

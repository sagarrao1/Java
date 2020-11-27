package chapter6;

public class JaggedArray {

	public static void main(String[] args) {
		int x[]= {1,2,3,4};
		int y[]= {5,6};
		int z[]= {7,8,9};
		
		int p[][]= {  {1,2,3,4},
				          {5,6},
				         {7,8,9}
				};
		for (int i[] : p) {
			for (int j : i) 
			   {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		int k[][]=new int[3][];
		k[0]=new int[4];
		k[1]=new int[2];
		k[1]=new int[3];
		
		System.out.println(k);
	}
	
	

}

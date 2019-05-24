package chapter6;

public class TwoDArray {

	public static void main(String[] args) {
		int x[]= {1,2, 3,4};
		int y[]= {5,6,7,8};
		int z[]= {9,10,11,12};
		
		int p[][]= {  {1,2, 3,4},
						  {5,6,7,8},
						  {9,10,11,12}
					  };
		//System.out.println(p.length);
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < 4; j++) {
				//System.out.print("p["+i+"]["+j+"] ");
				System.out.print(p[i][j]+" ");
			}
			System.out.println("");
		}

	}

}

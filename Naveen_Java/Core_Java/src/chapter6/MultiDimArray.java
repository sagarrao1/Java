package chapter6;

public class MultiDimArray {

	public static void main(String[] args) {
		int x[]=new int[4];
		int y[][]=new int[3][4];
		int p[][][]=new int [4][4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					p[i][j][k]=i+j+k;
				}				
			}			
		}
		
		/*
		 * for (int i = 0; i < 4; i++) { for (int j = 0; j < 4; j++) { for (int k = 0; k
		 * < 4; k++) { System.out.print(p[i][j][k]+" "); } System.out.println(); } }
		 */
		
		for (int i[][]: p) {
			for (int j[]:i) {
				for (int k: j) {
					System.out.print(k+" ");
				}				
				System.out.println();
			}			
		}

	}

}

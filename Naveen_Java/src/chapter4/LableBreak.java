package chapter4;
public class LableBreak {
	public static void main(String[] args) {
		
		/*
		 * sagar: for (int i = 0; i < 4; i++) { for (int j = 0; j < 4; j++) { if(i==2) {
		 * break sagar; // unlabled break; } System.out.print("* "); }
		 * System.out.println(); }
		 */
	
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if ((i==2||i==3) &&(j==2|| j==3)) {
					System.out.printf("  ");
				}else
				System.out.print("* ");
			}
			System.out.println();
		}
	/* 1 2 3 4
		2 3 4 1
		3 4 1 2
		4 1 2 3
	*/
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				int c=(i+j)-1;
				if (c>4) c=c-4;
				System.out.print(" "+c);
			
			}
			System.out.println();			
		}
		System.out.println("---------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if((i+j+1)%2==0) {
				System.out.print("0 ");
				}else {
					System.out.print("1 ");
				}
			}
			System.out.println();			
		}
		
		System.out.println("---------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {				
				System.out.print(i+" ");
				}
			System.out.println();	
			}
			
	}

}

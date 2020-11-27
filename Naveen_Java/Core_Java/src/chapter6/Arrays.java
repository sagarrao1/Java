package chapter6;
public class Arrays {
	public static void main(String[] args) {
		// Arrays in Java are Objects not primitive data type
		int a[]=new int[5];
		// 2 4  9 5 1
		// 0 1 2 3 4 index
		a[0]=2;
		a[1]=4;
		a[2]=9;
		a[3]=5;
		a[4]=1;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
	}

}

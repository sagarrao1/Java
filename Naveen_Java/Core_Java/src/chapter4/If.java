package chapter4;

public class If {

	public static void main(String[] args) {
		int a,b,c;
		a=3;
		b=15;
		c=8;
		
		if (a>b && a>c) {
			System.out.println("A");
		}
		else if (b>c){
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}

	}

}

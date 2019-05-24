package chapter15;

public class SingleDemo2 {

	public static void main(String[] args) {
		Abd obj1= Abd.INSTANCE;		
		obj1.i=5;
		obj1.show();
		
		Abd obj2= Abd.INSTANCE;		
		obj2.i=6;
		obj1.show();   // we are calling obj1

	}
}

enum Abd{
	INSTANCE;
	int i;
	public void show() {
		System.out.println(i);
	}
}

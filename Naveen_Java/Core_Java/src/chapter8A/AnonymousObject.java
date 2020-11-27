package chapter8A;
public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB obj=new AB();
		obj.a=3;
		obj.show();
		
		new AB().a=29;
		new AB().show(); //Anonymous Object
		// show method will not now show value of a as 29 because they are different objetcs in 
		//heap memory. if you want assign some value to instance var and use it method
		// we need to use reference object.
		
		
		
	}
}

class AB
{
	int a;
	public void show() {
		System.out.println("a is"+a);
	}
}

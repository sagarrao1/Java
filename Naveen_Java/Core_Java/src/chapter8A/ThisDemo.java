package chapter8A;

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisC obj=new ThisC(6);
		obj.show();
	}
}
// There are 3 types of variables. instance , local , class
// static int s is class variable
class ThisC
{
	//static int st;  
	private int x;		  //instance
	public ThisC(int x) {   // a is local variable
		this.x=x;		// this is current instance
	}
	public void show() {
		System.out.println("x is "+x);
	}
}

package chapter15;

public class InnerDemo {

	public static void main(String[] args) {
		//Y y=new Y();		
       //Y.Z obj=y.new Z();
		//obj.show();
		
		Y.Z obj =new Y.Z();
		obj.show();

	}
}

class Y{
	int rollno;
	static class Z{
		public void show() {
			System.out.println(" Hello Z");
		}
	}

}



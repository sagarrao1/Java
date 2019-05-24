package chapter11;

//1. shollow copy
//2. deep copy
// object cloning
class Abc extends Object  implements Cloneable
{
	int i, j;

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}

}

public class ObjectCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Abc obj = new Abc();
		obj.i = 5;
		obj.j = 6;		
		/*Abc obj1= new Abc();		
		 * obj1.i=obj.i; //deep copying obj1.j=obj.j; // obj1=obj; // shallow copying
		 * obj.j=7;
		 */
		Abc obj1= (Abc) obj.clone();   // it will create new object and copy obj values
		                                  // cloning is both shallow+ deep
		obj.j=7;
		System.out.println("Obj: "+obj);
		System.out.println("obj1: "+obj1);		
	}
}

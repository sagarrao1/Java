package chapter8;
// all X class non private feature will come to Y class
public class InheritenceDemo {

	public static void main(String[] args) {
		/*
		 * Y obj=new Y(); obj.num1=5; obj.num2=4;
		 * System.out.println("result: "+obj.result); obj.add();
		 * System.out.println("sum: "+obj.result); obj.sub();
		 * System.out.println("sub: "+obj.result);
		 */
		Z obj=new Z();
		obj.num1=5;
		obj.num2=4;
		System.out.println("result: "+obj.result);
		obj.add();
		System.out.println("sum: "+obj.result);
		obj.sub();
		System.out.println("sub: "+obj.result);
		obj.multi();
		System.out.println("Multi: "+obj.result);
	}

}

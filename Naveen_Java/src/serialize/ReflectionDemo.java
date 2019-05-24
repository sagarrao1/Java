package serialize;

import java.lang.reflect.Method;

class A{
	
}

public class ReflectionDemo {
	// accessing private method of class using Reflection API
	public static void main(String[] args) throws Exception 
	{
		/*
		 * Test t = new Test(); t.show();
		 */
		 
		Class c= Class.forName("serialize.Test");
		Test t= (Test) c.newInstance();
		//Test t= new Test();
		
		Method m= c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
		
		Class cl=Class.forName("serialize.A");
		
		System.out.println(cl.isInterface());
		System.out.println(cl.getSuperclass());
		System.out.println(cl.getSimpleName());
		System.out.println(cl.getFields());
		
		
	}
}



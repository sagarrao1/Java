package chapter9;

import java.util.ArrayList;

public class Wrapper {
	public static void main(String[] args) {
		
		int i=10,j,jj;
		Integer iobj=new Integer(i);  // Boxing
		Integer jobj=5;                      //AutoBoxing		
		
		System.out.println(iobj);
		System.out.println(jobj);
		
		j=iobj.intValue();    // UnBoxing
		jj= jobj;                // Auto UnBoxing
		System.out.println("J is "+j);
		System.out.println("JJ is "+jj);
		
		
		
		ArrayList<Integer> values=new ArrayList<Integer>();
		values.add(8);
		values.add(5);
		//values.add("Sagar");
		
		int k= values.get(0);
		System.out.println("k is "+k);
		
	}

}

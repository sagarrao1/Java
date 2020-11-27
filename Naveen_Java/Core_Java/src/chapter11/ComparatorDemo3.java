package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Compare1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1%10>o2%10?1:-1;
		
		
		  /*int diff=0;
		  if (o1%10>o2%10) 
			  diff=1;
		  else if (o1%10<o2%10) 
			  diff=-1;
		  
		  return diff; */
		 
	}
	
}

public class ComparatorDemo3 {
	public static void main(String[] args) {
		ArrayList<Integer> values=new ArrayList<Integer>();
		Random r= new Random();
		
		
		for (int i = 0; i < 100; i++) {
			values.add(r.nextInt(1000));
		}
		
		//Comparator<Integer> comp=new Compare1();
		
		Comparator<Integer> comp=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1%10>o2%10?1:-1;
			}	
		};
		
		//Lambda Expression with Annonymous class
		Comparator<Integer> comp1=(Integer o1, Integer o2)  -> {
				return o1%10>o2%10?1:-1;			
		};
		
		//Collections.sort(values, comp);
		Collections.sort(values, comp1);
		
		Collections.sort(values, ( o1,  o2)  -> { return o1%10>o2%10?1:-1;});
		
		
		//values.remove(8);
		for (Integer a : values) {
			System.out.println(a);
		}
		

	}

}

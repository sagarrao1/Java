package chapter4;

public class Switch {

	public static void main(String[] args) {
		int i=2;
		// switch case also supports string also
		// String s ="hi"
		//switch(s) {
		// case "hi":
		
		switch(i) {
		
		case 1:
		  System.out.println("One");
		  
		case 4:
		  System.out.println("Four");
		  break;
		case 6:
		  System.out.println("Six");
		  break;
		case 7:
		  System.out.println("Seven");
		 break;
		 
		 default:
			 System.out.println("Some number");
		}

	}

}

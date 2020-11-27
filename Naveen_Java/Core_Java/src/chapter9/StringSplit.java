package chapter9;

public class StringSplit {

	public static void main(String[] args) {
		String str="Sagar,Vijay,Shekar,Sanju";
		
		String names[]=str.split(",");
		
		for (String val : names) {
			System.out.println(val);
		}
		
		
		String str1="Saagar";
		String str2=new String("Rao");
		System.out.println();
		System.out.println(str1);
		System.out.println(str2);
		

	}

}

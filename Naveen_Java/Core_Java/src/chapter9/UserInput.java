package chapter9;

public class UserInput {
	//Scanner
	//BufferedReader
	public static void main(String[] args)  throws Exception
	{
		int i;
		//System.out.println((char)i);
		
		String str="";
		while(( i=System.in.read())!=48) {
			str=str+(char)i;
		}
		System.out.println(str);
	}

}

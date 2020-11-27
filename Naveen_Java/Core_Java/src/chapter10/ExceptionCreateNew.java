package chapter10;

public class ExceptionCreateNew {
	public static void main(String[] args) {
		int i = 5;
		
		try {
			if (i < 10) {
				throw new MyException("Errorrrrrr...");
			}
		} catch (MyException e) {
			System.out.println("New exceptopn: " + e);
		}
	}
}
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}

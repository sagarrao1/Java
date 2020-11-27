package chapter4;

public class ShortHand {

	public static void main(String[] args) {
		byte b=8;
		b= (byte) (b*2.5);
		//b *= 2.5;
		System.out.println(b);

		int i = 0B10100_00_00;
		System.out.println(i);
	}

}

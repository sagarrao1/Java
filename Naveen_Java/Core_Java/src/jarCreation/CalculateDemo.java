package jarCreation;


import chapter4.Calculator;

public class CalculateDemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int k=  calc.add(8, 5);
		System.out.println("k is : "+k);
		

	}

}

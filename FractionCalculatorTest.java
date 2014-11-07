package fractionAy;

import java.util.Scanner;

public class FractionCalculatorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("0");
		System.out.println("Hi Aymar");
		System.out.println("Please enter a positive integer ");
		int num = input.nextInt();
		System.out.println("Please enter another a positive integer ");
		int denom = input.nextInt();
		Fraction f = new Fraction(num, denom);
		System.out.println(f);
		
		input.close();
	}

}

package fractionAy;

/**
 * This class takes an input from the user and splits into fractions
 * that get computed using operations in the class FractionCalculator
 * @author AbJr
 * @version 101114
 */

import java.util.Scanner;

public class FractionCalculatorTest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("0");
		System.out.println("Hi Aymar");
		System.out.print("Please enter an expression: ");
		String expression = input.nextLine();
		int n = expression.length();
		StringTokenizer expressionbits = new StringTokenizer(expression, " ");
		String[] frac = new String [n];
		
		for (int i = 0; i<frac.length; i++){
			frac[i] = expressionbits.nextToken();
			StringTokenizer fracbits = new StringTokenizer(frac[i], "/");
			String fracnum = fracbits.nextToken();
			String fracdenom = fracbits.nextToken();
			System.out.println(frac[i]);
			System.out.println(fracnum);
			System.out.println(fracdenom);
		}
		
		input.close();
	}

}

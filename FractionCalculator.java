/**
 * This class applies arithmetical operations on fractions
 * @author AbJr
 * @version 101114
 */
package fractionAy;

public class FractionCalculator extends Fraction {
	
	private static int numer;
	private static int denomi;

	public FractionCalculator() {
		super(numer, denomi);
	}
	
	private int myGcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	/*
	 * This method adds two fractions
	 * @param other the fraction in the operation
	 * @return a new fraction
	 */
	public Fraction add(Fraction other) {
		int num = (this.getNumerator() * other.getDenominator())
				+ (other.getNumerator() * this.getDenominator());
		int denom = this.getDenominator() * other.getDenominator();
		return new Fraction(num, denom);
	}

	/*
	 * This method subtracts the next fraction from the first
	 * @param other the fraction in the operation
	 * @return a new fraction
	 */
	public Fraction substract(Fraction other) {
		int num = (this.getNumerator() * other.getDenominator())
				- (other.getNumerator() * this.getDenominator());
		int denom = this.getDenominator() * other.getDenominator();
		return new Fraction(num, denom);
	}

	/*
	 * This method divides two fractions
	 * @param other the fraction in the operation
	 * @return a new fraction
	 */
	public Fraction divide(Fraction other) {
		int num = this.getNumerator() * other.getDenominator();
		int denom = this.getDenominator() * other.getNumerator();
		return new Fraction(num, denom);
	}

	/*
	 * This method converts a fraction into a positive one
	 * @param other the fraction in the operation
	 * @return a new fraction
	 */
	public Fraction absValue(Fraction other) {
		int num = Math.abs(other.getNumerator());
		int denom = Math.abs(other.getDenominator());
			//if (num<0)
				//num = -num;
		return new Fraction(num, denom);
	}

	/*
	 * This method change the sign of a fraction
	 * @param other the fraction in the operation
	 * @return a new fraction
	 */
	public Fraction negate(Fraction other) {
		int num = other.getNumerator();
		int denom = other.getDenominator();
		num = -num;
		return new Fraction(num, denom);
	}
	
}

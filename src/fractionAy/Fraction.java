package fractionAy;

/**
 * @author Created by keith for the second coursework assignment.
 *
 */

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int num, int denom) {
		if (denom == 0) {
			// This throws an unchecked exception
			throw new IllegalArgumentException(
					"Invalid fraction with denominator 0");
		}
		int gcd = myGcd(num, denom);
		setNumerator(num / gcd);
		setDenominator(denom / gcd);
	}

	@Override
	public String toString() {
		if (getDenominator() == 1)
			return "" + getNumerator();
		return "" + getNumerator() + '/' + getDenominator();
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int num) {
		denominator = num;
	}

	public void setNumerator(int num) {
		numerator = num;
	}

	@Override
	public int hashCode() {
		int result = numerator;
		result = 31 * result + denominator;
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Fraction fraction = (Fraction) o;
		if (getDenominator() != fraction.getDenominator())
			return false;
		if (getNumerator() != fraction.getNumerator())
			return false;
		return true;
	}

	public Fraction multiply(Fraction other) {
		int num = this.getNumerator() * other.getNumerator();
		int denom = this.getDenominator() * other.getDenominator();
		return new Fraction(num, denom);
	}

	private int myGcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	// Addition
	public Fraction add(Fraction other) {
		int num = (this.getNumerator() * other.getDenominator())
				+ (other.getNumerator() * this.getDenominator());
		int denom = this.getDenominator() * other.getDenominator();
		return new Fraction(num, denom);
	}

	// substraction
	public Fraction substract(Fraction other) {
		int num = (this.getNumerator() * other.getDenominator())
				- (other.getNumerator() * this.getDenominator());
		int denom = this.getDenominator() * other.getDenominator();
		return new Fraction(num, denom);
	}

	// Division
	public Fraction divide(Fraction other) {
		int num = this.getNumerator() * other.getDenominator();
		int denom = this.getDenominator() * other.getNumerator();
		return new Fraction(num, denom);
	}

	// Absolute value
	public Fraction absValue(Fraction other) {
		int num = Math.abs(other.getNumerator());
		int denom = Math.abs(other.getDenominator());
			//if (num<0)
				//num = -num;
		return new Fraction(num, denom);
	}

	// Division
	public Fraction negate(Fraction other) {
		int num = other.getNumerator();
		int denom = other.getDenominator();
		num = -num;
		return new Fraction(num, denom);
	}
}

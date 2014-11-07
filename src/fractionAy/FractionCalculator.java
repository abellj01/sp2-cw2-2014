/**
 * 
 * 
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

package fractionAy;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionCalculatorUnitTest {

	@Test
	public void testAdd() {
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(3,5);
		
		Fraction addition = a.add(b);
		assertEquals(new Fraction(11,10), addition);
	}
	
	@Test
	public void testSubstract() {
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(3,5);
		
		Fraction addition = a.substract(b);
		assertEquals(new Fraction(-1,10), addition);
	}
	
	@Test
	public void testDivide() {
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(3,5);
		
		Fraction addition = a.divide(b);
		assertEquals(new Fraction(5,6), addition);
	}
	
	@Test
	public void testAbsValue() {
		//Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(-3,5);
		
		Fraction addition = b.absValue(b);
		assertEquals(new Fraction(3,5), addition);
	}
	
	@Test
	public void testNegate() {
		//Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(-3,-5);
		
		Fraction addition = b.negate(b);
		assertEquals(new Fraction(-3,5), addition);
	}
	
	@Test
	public void testToString() {
		Fraction a = new Fraction(-3,-5);
		
		String b = a.toString();
		assertEquals("3/5", b);
	}

}

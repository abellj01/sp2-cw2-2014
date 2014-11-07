/**
 * 
 */
package fractionAy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author abellj01
 *
 */
public class FractionUnitTest {
	
	@Test
	public void testMultiply() {
		//Fraction a = new Fraction(1, 0);
			
		Fraction f = new Fraction(3,10);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(3,5);
		
		Fraction result = g.multiply(g);
		assertEquals(new Fraction(1,4), result);
		
		Boolean a = f.equals(g.multiply(h));
		assertEquals(true, a);
		
		if (!f.equals(g.multiply(h)))
			System.out.println("Multiply failed");
		else
			System.out.println("Multiply ok");
		
		if(new Fraction(1, 2).equals(new Fraction(1, 2)))
			System.out.println("Both fractions are equal");
		else
			System.out.println("error test 1");
		
		if(new Fraction(1, 2).equals(new Fraction(3, 4)))
			System.out.println("Both fractions are equal");
		else
			System.out.println("error test 2");
	}
	
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
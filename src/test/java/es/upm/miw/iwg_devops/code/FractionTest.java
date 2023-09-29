package es.upm.miw.iwg_devops.code;

import static org.junit.Assert.*;

import es.upm.miw.iwvg_devops.code.Fraction;

import org.junit.Test;

public class FractionTest {



    @Test
    public void testConstructorWithArguments() {
        Fraction fraction = new Fraction(3, 4);
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public  void testDefaultConstructor() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    public void testSetNumerator() {
        Fraction fraction = new Fraction();
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    public void testSetDenominator() {
        Fraction fraction = new Fraction();
        fraction.setDenominator(6);
        assertEquals(6, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        Fraction fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal(), 0.001);
    }

    @Test
    public void testToString() {
        Fraction fraction = new Fraction(2, 3);
        assertEquals("Fraction{numerator=2, denominator=3}", fraction.toString());
    }


}

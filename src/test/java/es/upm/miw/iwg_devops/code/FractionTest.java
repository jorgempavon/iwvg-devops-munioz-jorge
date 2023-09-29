package es.upm.miw.iwg_devops.code;

import static org.junit.Assert.*;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.Before;
import org.junit.Test;
public class FractionTest {
    private Fraction fraction;

    @Before
    public void setUp() {
        fraction = new Fraction(3, 4);
    }

    @Test
    public void testGetNumerator() {
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    public void testSetNumerator() {
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public void testSetDenominator() {
        fraction.setDenominator(7);
        assertEquals(7, fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.75, fraction.decimal(), 0.001); // Utilizamos delta para comparaciones de punto flotante
    }

    @Test
    public void testDefaultConstructor() {
        Fraction defaultFraction = new Fraction();
        assertEquals(1, defaultFraction.getNumerator());
        assertEquals(1, defaultFraction.getDenominator());
    }

    @Test
    public void testToString() {
        assertEquals("Fraction{numerator=3, denominator=4}", fraction.toString());
    }


}

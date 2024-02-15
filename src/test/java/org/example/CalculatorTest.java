package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Calculator.squareRoot(4), 0.001);
        assertEquals(3.0, Calculator.squareRoot(9), 0.001);
        assertEquals(4.0, Calculator.squareRoot(16), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Calculator.naturalLogarithm(1), 0.001);
        assertEquals(1.609, Calculator.naturalLogarithm(5), 0.001);
        assertEquals(2.303, Calculator.naturalLogarithm(10), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2, 3), 0.001);
        assertEquals(25.0, Calculator.power(5, 2), 0.001);
        assertEquals(1.0, Calculator.power(10, 0), 0.001);
    }
}

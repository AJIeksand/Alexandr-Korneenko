package com.aston.java.lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FactorialCalculatorTest {
    @Test
    void testFactorial() {
        assertEquals(1, FactorialCalculator.factorial(0));
        assertEquals(1, FactorialCalculator.factorial(1));
        assertEquals(2, FactorialCalculator.factorial(2));
        assertEquals(6, FactorialCalculator.factorial(3));
        assertEquals(24, FactorialCalculator.factorial(4));
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testFactorialWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-5));
    }

    @Test
    void testFactorialForZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialWithOverflow() {
        assertThrows(ArithmeticException.class, () -> FactorialCalculator.factorial(21));
    }

    @Test
    void testFactorialWithBoundaryInput() {
        assertEquals(479001600, FactorialCalculator.factorial(12));
    }
}

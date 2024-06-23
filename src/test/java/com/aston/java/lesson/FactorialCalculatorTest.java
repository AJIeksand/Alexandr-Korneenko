package com.aston.java.lesson;

import org.testng.Assert;

import org.testng.annotations.Test;


public class FactorialCalculatorTest {
    @Test
    void testFactorial() {
        Assert.assertEquals(FactorialCalculator.factorial(0), 1);
        Assert.assertEquals(FactorialCalculator.factorial(1), 1);
        Assert.assertEquals(FactorialCalculator.factorial(2), 2);
        Assert.assertEquals(FactorialCalculator.factorial(3), 6);
        Assert.assertEquals(FactorialCalculator.factorial(4), 24);
        Assert.assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testFactorialWithNegativeInput() {
        FactorialCalculator.factorial(-5);
    }

    @Test
    public void testFactorialForZero() {
        Assert.assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test (expectedExceptions = ArithmeticException.class)
    public void testFactorialWithOverflow() {
        FactorialCalculator.factorial(21);
    }

    @Test
    void testFactorialWithBoundaryInput() {
        Assert.assertEquals(FactorialCalculator.factorial(12), 479001600);
    }
}

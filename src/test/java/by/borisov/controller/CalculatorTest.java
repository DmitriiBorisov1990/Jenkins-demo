package by.borisov.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    private Calculator calculator;
    private Double expectedResult;

    @BeforeAll
    void setUp() {
        calculator = new CalculatorImpl();
    }

    @Test
    void sumTest() {
        System.out.println("1");
        expectedResult = 3.0;
        Assertions.assertEquals(expectedResult, calculator.sum(1, 2));
    }

    @Test
    void subtractionTest() {
        System.out.println("2");
        expectedResult = 7.0;
        Assertions.assertEquals(expectedResult, calculator.subtraction(10, 3));
    }

    @Test
    void testMultiplicationTest() {
        System.out.println("3");
        expectedResult = 15.0;
        Assertions.assertEquals(expectedResult, calculator.multiplication(3, 5));
    }

    @Test
    void testDivisionTest() {
        System.out.println("4");
        expectedResult = 3.0;
        Assertions.assertEquals(expectedResult, calculator.division(9.0, 3.0));
    }
}
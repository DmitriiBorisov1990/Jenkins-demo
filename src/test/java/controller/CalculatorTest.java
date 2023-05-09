package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        Assertions.assertEquals(3, calculator.sum(1, 2));
    }

    @Test
    void subtractionTest() {
        Assertions.assertEquals(7, calculator.subtraction(10, 3));
    }

    @Test
    void multiplication() {
        Assertions.assertEquals(15, calculator.multiplication(3, 5));
    }

    @Test
    void division() {
        Assertions.assertEquals(3.0, calculator.division(9.0, 3.0));
    }
}
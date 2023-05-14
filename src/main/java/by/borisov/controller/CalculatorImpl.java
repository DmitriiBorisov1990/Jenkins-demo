package by.borisov.controller;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorImpl implements Calculator {

    @Override
    public Double sum(double a, double b) {
        return a + b;
    }

    @Override
    public Double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public Double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public Double division(double a, double b) {
        return a / b;
    }
}

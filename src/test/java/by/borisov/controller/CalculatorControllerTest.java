package by.borisov.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class CalculatorControllerTest {

    @Mock
    Calculator calculator;

    @InjectMocks
    CalculatorController calculatorController;

    @Test
    @DisplayName("GET/sum")
    void sumTest() {
        Double expectedResult = 5.0;
        Mockito.doReturn(expectedResult).when(this.calculator).sum(3, 2);
        ResponseEntity<Double> sumResponse = this.calculatorController.sum(3, 2);
        Assertions.assertNotNull(sumResponse);
        Assertions.assertEquals(HttpStatus.OK, sumResponse.getStatusCode());
        Assertions.assertEquals(expectedResult, sumResponse.getBody());
    }

    @Test
    void subtractionTest() {
        Double expectedResult = 6.0;
        Mockito.when(this.calculator.subtraction(12,6)).thenReturn(expectedResult);
        ResponseEntity<Double> subtractionResponse = this.calculatorController.subtraction(12, 6);
        Assertions.assertNotNull(subtractionResponse);
        Assertions.assertEquals(HttpStatus.OK, subtractionResponse.getStatusCode());
        Assertions.assertEquals(expectedResult, subtractionResponse.getBody());
    }

    @Test
    void multiplicationTest() {
        Double expectedResult = 7.0;
        Mockito.when(this.calculator.multiplication(3.5,2)).thenReturn(expectedResult);
        ResponseEntity<Double> multiplicationResponse = this.calculatorController.multiplication(3.5, 2);
        Assertions.assertNotNull(multiplicationResponse);
        Assertions.assertEquals(HttpStatus.OK, multiplicationResponse.getStatusCode());
        Assertions.assertEquals(expectedResult, multiplicationResponse.getBody());
    }

    @Test
    void divisionTest() {
        Double expectedResult = 8.0;
        Mockito.doReturn(expectedResult).when(this.calculator).division(32,4);
        ResponseEntity<Double> divisionResponse = this.calculatorController.division(32, 4);
        Assertions.assertNotNull(divisionResponse);
        Assertions.assertEquals(HttpStatus.OK, divisionResponse.getStatusCode());
        Assertions.assertEquals(expectedResult, divisionResponse.getBody());
    }
}
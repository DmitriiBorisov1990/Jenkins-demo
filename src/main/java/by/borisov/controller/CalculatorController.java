package by.borisov.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/calc")
public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/sum")
    public ResponseEntity<Double> sum(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.calculator.sum(a, b));
    }

    @GetMapping("/subtraction")
    public ResponseEntity<Double> subtraction(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(calculator.subtraction(a, b));
    }

    @GetMapping("/multiplication")
    public ResponseEntity<Double> multiplication(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(calculator.multiplication(a, b));
    }


    @GetMapping("/division")
    public ResponseEntity<Double> division(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(calculator.division(a, b));
    }
}

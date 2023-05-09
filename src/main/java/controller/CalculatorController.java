package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/api/calc")
public class CalculatorController {

    @GetMapping("/sum")
    public Double sum(Calculator calculator, @RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return calculator.sum(a, b);
    }

    @GetMapping("/subtraction")
    public Double subtraction(Calculator calculator, @RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return calculator.subtraction(a, b);
    }

    @GetMapping("/multiplication")
    public Double multiplication(Calculator calculator, @RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return calculator.multiplication(a, b);
    }


    @GetMapping("/division")
    public Double division(Calculator calculator, @RequestParam(value = "a") double a, @RequestParam(value = "b") double b) {
        return calculator.division(a, b);
    }
}

package com.example.calculator.controller;

import com.example.calculator.model.CalculationModel;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CalculatorController {

    @PostMapping(path = "/calculate")
    public CalculationModel calculate(@RequestBody CalculationModel calculationModel) {
        double firstNumber = calculationModel.getNum1();
        double secondNumber = calculationModel.getNum2();
        if (calculationModel.getOperation().equals("add")) {
            double result = firstNumber + secondNumber;
            calculationModel.setResult(result);
        }
        if (calculationModel.getOperation().equals("subtract")) {
            double result = firstNumber - secondNumber;
            calculationModel.setResult(result);
        }
        if (calculationModel.getOperation().equals("multiply")) {
            double result = firstNumber * secondNumber;
            calculationModel.setResult(result);
        }
        if (calculationModel.getOperation().equals("divide")) {
            double result = firstNumber / secondNumber;
            calculationModel.setResult(result);
        }
        System.out.println("Hit with:" + calculationModel.getResult());
        return calculationModel;
    }
}

package pro.sky.skyprodemospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorServiceImpl.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.calculatorPlus(num1,num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.calculatorDivide(num1, num2);
    }



}

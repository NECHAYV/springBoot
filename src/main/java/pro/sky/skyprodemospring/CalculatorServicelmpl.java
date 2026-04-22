package pro.sky.skyprodemospring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculatorPlus(int num1, int num2) {
        int res = num1 + num2;
        return num1 + " + " + num2 + " = " + res;
    }

    @Override
    public String calculatorMinus(int num1, int num2) {
        int res = num1 - num2;
        return num1 + " - " + num2 + " = " + res;
    }

    @Override
    public String calculatorMultiply(int num1, int num2) {
        int res = num1 * num2;
        return num1 + " * " + num2 + " = " + res;
    }

    @Override
    public String calculatorDivide(int num1, int num2) {
        if (num2 != 0) {
            int res = num1 / num2;
            return num1 + " / " + num2 + " = " + res;
        }else {
            return "Йоу, делить на ноль нельзя";
        }
    }

}

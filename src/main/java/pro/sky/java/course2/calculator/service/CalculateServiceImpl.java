package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String calculatePlus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String calculateMinus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String calculateMultiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String calculateDivide(int num1, int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);

        } else {
            return "Division by 0 is forbidden";
        }
    }
}

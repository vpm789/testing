package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int calculatePlus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int calculateMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculateMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int calculateDivide(int num1, int num2) {
        return num1 / num2;
    }
}

package pro.sky.java.course2.calculator.service;

public interface CalculateService {
    String welcomeCalculator();
    int calculatePlus(int num1, int num2);
    int calculateMinus(int num1, int num2);
    int calculateMultiply(int num1, int num2);
    int calculateDivide(int num1, int num2);
}

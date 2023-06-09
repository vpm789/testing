package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.java.course2.calculator.constants.CalculateServiceTestConstants.*;

public class CalculateServiceParameterizedTest {
    private final CalculateServiceImpl out = new CalculateServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTestPlus")
    public void shouldReturnErrorWhenPlusIsIncorrect(int num1, int num2, int sum) {
        int result = out.calculatePlus(num1, num2);
        assertEquals(sum, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    public void shouldReturnErrorWhenMinusIsIncorrect(int num1, int num2, int difference) {
        int result = out.calculateMinus(num1, num2);
        assertEquals(difference, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    public void shouldReturnErrorWhenMultiplyIsIncorrect(int num1, int num2, int multiplication) {
        int result = out.calculateMultiply(num1, num2);
        assertEquals(multiplication, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    public void shouldReturnErrorWhenDivideIsIncorrect(int num1, int num2, int division) {
        int result = out.calculateDivide(num1, num2);
        assertEquals(division , result);
    }
    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, CORRECT_PLUS)
        );
    }

    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, CORRECT_DIVIDE)
        );
    }

    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, CORRECT_MINUS)
        );
    }

    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, CORRECT_MULTIPLY)
        );
    }
}

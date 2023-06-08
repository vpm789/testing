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
    @MethodSource("provideParamsForTests")
    public void shouldReturnErrorWhenPlusIsIncorrect(int num1, int num2, int sum) {
        int result = out.calculatePlus(num1, num2);
        assertEquals(sum, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnErrorWhenMinusIsIncorrect(int num1, int num2, int difference) {
        int result = out.calculateMinus(num1, num2);
        assertEquals(difference, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnErrorWhenMultiplyIsIncorrect(int num1, int num2, int multiplication) {
        int result = out.calculateMultiply(num1, num2);
        assertEquals(multiplication, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnErrorWhenDivideIsIncorrect(int num1, int num2, int division) {
        int result = out.calculateDivide(num1, num2);
        assertEquals(division , result);
    }
    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(NUM1, NUM2, CORRECT_PLUS),
                Arguments.of(NUM1, NUM2, CORRECT_MINUS),
                Arguments.of(NUM1, NUM2, CORRECT_MULTIPLY),
                Arguments.of(NUM1, NUM2, CORRECT_DIVIDE)
        );
    }
}

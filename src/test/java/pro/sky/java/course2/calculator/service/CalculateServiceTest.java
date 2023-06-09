package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.service.CalculateServiceImpl;
import static pro.sky.java.course2.calculator.constants.CalculateServiceTestConstants.*;

public class CalculateServiceTest {
    private final CalculateServiceImpl out = new CalculateServiceImpl();

    @Test
    public void shouldReturnErrorWhenPlusIsIncorrect() {
        int result = out.calculatePlus(NUM1, NUM2);
        Assertions.assertEquals(CORRECT_PLUS, result);
    }
    @Test
    public void shouldReturnErrorWhenMinusIsIncorrect() {
        int result = out.calculateMinus(NUM1, NUM2);
        Assertions.assertEquals(CORRECT_MINUS, result);
    }
    @Test
    public void shouldReturnErrorWhenMultiplyIsIncorrect() {
        int result = out.calculateMultiply(NUM1, NUM2);
        Assertions.assertEquals(CORRECT_MULTIPLY, result);
    }
    @Test
    public void shouldReturnErrorWhenDivideIsIncorrect() {
        int result = out.calculateDivide(NUM1, NUM2);
        Assertions.assertEquals(CORRECT_DIVIDE, result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNum2IsZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.calculateDivide(NUM1, NUM2_ZERO)
        );
    }
}

package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator("2 + 3 * 4 / 2");
    }

    @Test
    void calculatorTest(){
        int result = calculator.result();
        assertThat(result).isEqualTo(10);
    }

}
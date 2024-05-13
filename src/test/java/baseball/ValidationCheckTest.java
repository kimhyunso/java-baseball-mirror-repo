package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationCheckTest {

    @DisplayName("입력된 숫자가 3인지 판별하기")
    @ParameterizedTest
    @ValueSource(strings = "12")
    void 입력된숫자가3인가_False(String input){
        boolean result = ValidationCheck.isThreeWord(input);
        assertThat(result).isFalse();
    }

    @DisplayName("입력된 숫자가 3인지 판별하기")
    @ParameterizedTest
    @ValueSource(strings = "123")
    void 입력된숫자가3인가_True(String input){
        boolean result = ValidationCheck.isThreeWord(input);
        assertThat(result).isTrue();
    }


}

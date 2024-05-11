package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaseBallTest {

    @Test
    @DisplayName("유효성검사 입력값 1~9")
    void 유효성검사_입력값이1에서9까지(){
        assertThat(ValidationCheck.isCorrect(1)).isTrue();
        assertThat(ValidationCheck.isCorrect(9)).isTrue();
        assertThat(ValidationCheck.isCorrect(0)).isFalse();
        assertThat(ValidationCheck.isCorrect(10)).isFalse();
        assertThat(ValidationCheck.isCorrect(-20)).isFalse();
    }

    @DisplayName("유효성 검사 입력값이 세자리인지 판별하기")
    @ParameterizedTest
    @ValueSource(strings = "1232432")
    void 유효성검사_세자리판별_False(String input){
        boolean result = ValidationCheck.isThreeWord(input);
        assertThat(result).isFalse();
    }

    @DisplayName("유효성 검사 입력값이 세자리인지 판별하기")
    @ParameterizedTest
    @ValueSource(strings = "123")
    void 유효성검사_세자리판별_True(String input){
        boolean result = ValidationCheck.isThreeWord(input);
        assertThat(result).isTrue();
    }

}

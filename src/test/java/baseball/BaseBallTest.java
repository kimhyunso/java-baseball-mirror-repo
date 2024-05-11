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
        assertThat(ValidationCheck.valid(1)).isTrue();
        assertThat(ValidationCheck.valid(0)).isFalse();
        assertThat(ValidationCheck.valid(10)).isFalse();
        assertThat(ValidationCheck.valid(-20)).isFalse();
    }

}

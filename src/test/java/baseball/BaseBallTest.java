package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaseBallTest {

    @Test
    void 낫싱(){
        Computer com = new Computer(Arrays.asList(1, 2, 3));
        Player player = new Player(Arrays.asList(1, 2, 3));
        BaseBall baseBall = new BaseBall(com);
        BallStatus status = baseBall.play(player);
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void 스트라이크(){
        Computer com = new Computer(Arrays.asList(1, 2, 3));
        Player player = new Player(Arrays.asList(1, 2, 3));
        BaseBall baseBall = new BaseBall(com);
        BallStatus status = baseBall.play(player);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    

    @ParameterizedTest
    @DisplayName("입력숫자가 3개인지 판단하기")
    @ValueSource(strings = "12")
    void validationCheckFalse(String input){
        ValidationCheck check = new ValidationCheck();
        boolean result = check.isThreeWord(input);
        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @DisplayName("입력숫자가 3개인지 판단하기")
    @ValueSource(strings = "123")
    void validationCheckTrue(String input){
        ValidationCheck check = new ValidationCheck();
        boolean result = check.isThreeWord(input);
        assertThat(result).isTrue();
    }
}

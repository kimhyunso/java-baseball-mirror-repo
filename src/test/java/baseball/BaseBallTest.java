package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaseBallTest {

    @DisplayName("입력된 숫자가 위치와 숫자가 같은 3스트라이크")
    @Test
    void 스크라이크_3(){
        Balls comBalls = new Balls(Arrays.asList(1, 2, 3));
        BaseBallReport report = comBalls.play(new Balls(Arrays.asList(1, 2, 3)));
        assertThat(report.print()).isEqualTo("0볼 3스트라이크");
    }

    @DisplayName("입력된 숫자가 위치와 숫자가 같은 3볼")
    @Test
    void 볼_2_스트라이크_1(){
        Balls comBalls = new Balls(Arrays.asList(1, 2, 3));
        BaseBallReport report = comBalls.play(new Balls(Arrays.asList(2, 1, 3)));
        assertThat(report.print()).isEqualTo("2볼 1스트라이크");
    }


    @DisplayName("입력된 숫자가 위치와 숫자가 같지 않은 낫싱")
    @Test
    void 낫싱(){
        Balls comBalls = new Balls(Arrays.asList(1, 2, 3));
        BaseBallReport report = comBalls.play(new Balls(Arrays.asList(7, 8, 9)));
        assertThat(report.print()).isEqualTo("낫싱");
    }

}

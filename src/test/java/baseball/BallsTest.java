package baseball;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {


    @DisplayName("입력된 숫자가 유효하지 않는 낫싱")
    @Test
    void nothing(){
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BaseBallStatus status = balls.play(new Ball(1, 5));
        assertThat(status).isEqualTo(BaseBallStatus.NOTHING);
    }

    @DisplayName("입력된 숫자가 위치만 다른 볼")
    @Test
    void ball(){
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BaseBallStatus status = balls.play(new Ball(1, 2));
        assertThat(status).isEqualTo(BaseBallStatus.BALL);
    }

    @DisplayName("입력된 숫자가 위치와 숫자가 같은 스트라이크")
    @Test
    void strike(){
        Balls balls = new Balls(Arrays.asList(1, 2, 3));
        BaseBallStatus status = balls.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BaseBallStatus.STRIKE);
    }
}

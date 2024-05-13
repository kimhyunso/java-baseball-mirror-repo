package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaseBallTest {

    @DisplayName("입력된 숫자가 일치하지 않는 낫싱")
    @Test
    void nothing(){
        Ball ball = new Ball(1, 2);
        BaseBallStatus status = ball.play(new Ball(1, 5));
        assertThat(status).isEqualTo(BaseBallStatus.NOTHING);
    }

    @DisplayName("입력된 숫자가 값은 같은데 위치가 다른 볼")
    @Test
    void ball(){
        Ball ball = new Ball(1, 2);
        BaseBallStatus status = ball.play(new Ball(2, 2));
        assertThat(status).isEqualTo(BaseBallStatus.BALL);
    }

}

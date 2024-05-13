package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaseBallTest {

    @Test
    void nothing(){
        Ball ball = new Ball(1, 2);
        BaseBallStatus status = ball.play(new Ball(1, 5));
        assertThat(status).isEqualTo(BaseBallStatus.NOTHING);
    }

    @Test
    void ball(){
        Ball ball = new Ball(1, 2);
        BaseBallStatus status = ball.play(new Ball(2, 2));
        assertThat(status).isEqualTo(BaseBallStatus.BALL);
    }

}

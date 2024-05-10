package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {
    private Ball com;

    @BeforeEach
    void setUp(){
        com = new Ball(1, 4);
    }

    @Test
    void nothing(){
        Ball com = new Ball(1, 4);
        BallStatus status = com.play(new Ball(2, 5));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball(){
        Ball com = new Ball(1, 4);
        BallStatus status = com.play(new Ball(2, 4));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

}

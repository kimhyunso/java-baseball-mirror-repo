package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BaseBallTest {

    @Test
    void 볼(){
        Player player = new Player(1, 2);
        Computer com = new Computer(2, 1);
        BaseBall baseBall = new BaseBall(com);
        BallStatus status = baseBall.play(player);
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void 스트라이크(){
        Player player = new Player(1, 2);
        Computer com = new Computer(1, 2);
        BaseBall baseBall = new BaseBall(com);
        BallStatus status = baseBall.play(player);
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void 낫싱(){
        Player player = new Player(1, 2);
        Computer com = new Computer(1, 5);
        BaseBall baseBall = new BaseBall(com);
        BallStatus status = baseBall.play(player);
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }


}

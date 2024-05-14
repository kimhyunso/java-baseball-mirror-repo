package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Balls {
    private final List<Ball> comBalls;
    private final AtomicInteger index = new AtomicInteger(1);

    public Balls(List<Integer> balls) {
        comBalls = balls.stream()
        .map(this::convertBall).collect(Collectors.toList());
    }

    private Ball convertBall(Integer ball) {
        return new Ball(index.getAndIncrement(), ball);
    }

    public BaseBallStatus play(Ball userBall) {
        return comBalls.stream()
                .map(userBall::play)
                .filter(BaseBallStatus::isNotNothing)
                .findFirst()
                .orElse(BaseBallStatus.NOTHING);
    }

        public BaseBallReport play(List<Integer> userBalls) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i=0; i<3; i++){
            BaseBallStatus  status = this.play(new Ball(i+1, userBalls.get(i)));
            if (status.isStrike()){
                strikeCount ++;
            }

            if (status.isBall()){
                ballCount ++;
            }
        }

        return new BaseBallReport(strikeCount, ballCount);
    }

}

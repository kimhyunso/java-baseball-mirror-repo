package baseball;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Balls {
    private final List<Ball> comBalls;
    private final AtomicInteger index = new AtomicInteger(1);
    private int strikeCount = 0;
    private int ballCount = 0;

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

    public BaseBallReport play(Balls userBalls) {
        for (Ball ball : this.comBalls){
            playCount(userBalls.play(ball));
        }

        return new BaseBallReport(strikeCount, ballCount);
    }

    private void playCount (BaseBallStatus status){
        if (status.isStrike()){
            this.strikeCount ++;
        }

        if (status.isBall()){
            this.ballCount ++;
        }
    }


}

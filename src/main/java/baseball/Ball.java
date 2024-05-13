package baseball;

public class Ball {
    private final int position;
    private final int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public BaseBallStatus play(Ball userBall) {
        if (isBall(userBall)){
            return BaseBallStatus.BALL;
        }

        return BaseBallStatus.NOTHING;
    }

    private boolean isBall(Ball userBall) {
        return userBall.number == number;
    }
}

package baseball;

import java.util.Objects;

public class Ball {
    private final int position;
    private final int number;

    public Ball(int position, int number) {
        Number numeric = new Number(number);
        this.position = position;
        this.number = numeric.getNumber();
    }

    public BaseBallStatus play(Ball userBall) {

        if (this.equals(userBall)){
            return BaseBallStatus.STRIKE;
        }

        if (isBall(userBall)){
            return BaseBallStatus.BALL;
        }

        return BaseBallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }

    private boolean isBall(Ball userBall) {
        return userBall.number == number;
    }
}

package baseball;

public class BaseBallReport {

    private final int strikeCount;
    private final int ballCount;
    public BaseBallReport(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    @Override
    public String toString() {

        String message = String.format("%d볼 %d스트라이크", this.ballCount, this.strikeCount);
        if (isZero())
            message = "낫싱";

        return message;
    }

    private boolean isZero() {
        return this.strikeCount == 0 && this.ballCount == 0;
    }
}

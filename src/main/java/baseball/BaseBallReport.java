package baseball;

public class BaseBallReport {

    private int strikeCount = 0;
    private int ballCount = 0;
    private String message = "";

    public BaseBallReport(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    @Override
    public String toString() {

        message = String.format("%d볼 %d스트라이크", ballCount, strikeCount);
        if (isZero())
            message = "낫싱";

        return message;
    }

    private boolean isZero() {
        return strikeCount == 0 && ballCount == 0;
    }
}

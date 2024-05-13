package baseball;

public class BaseBallReport {

    private int strikeCount = 0;
    private int ballCount = 0;
    private String message = "";

    public BaseBallReport(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;

        message = ballCount + "볼 " + strikeCount + "스트라이크";
        if (isZero())
            message = "낫싱";
    }

    @Override
    public String toString() {
        return message;
    }

    private boolean isZero() {
        return strikeCount == 0 && ballCount == 0;
    }
}

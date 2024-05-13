package baseball;

public class BaseBallReport {

    private int strikeCount = 0;
    private int ballCount = 0;

    private static final String MESSAGE = "낫싱";

    public BaseBallReport(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public String print() {
        if (isZeroCount()){
            return MESSAGE;
        }
        return String.format("%d볼 %d스트라이크", ballCount, strikeCount);
    }

    private boolean isZeroCount() {
        return strikeCount == 0 && ballCount == 0;
    }


}

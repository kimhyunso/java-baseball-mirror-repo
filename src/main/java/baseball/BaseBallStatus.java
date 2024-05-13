package baseball;

public enum BaseBallStatus {
    BALL, STRIKE, NOTHING;

    public boolean isNotNothing() {
        return this != BaseBallStatus.NOTHING;
    }
}

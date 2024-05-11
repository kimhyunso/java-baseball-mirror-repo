package baseball;

public class ValidationCheck {

    private static final int MIN_NO = 0;
    private static final int MAX_NO = 10;

    public boolean valid(int input) {
        return input > MIN_NO && input < MAX_NO;
    }
}

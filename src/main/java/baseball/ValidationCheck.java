package baseball;

public class ValidationCheck {

    private static final int MIN_NO = 0;
    private static final int MAX_NO = 10;

    public static boolean isCorrect(int input) {
        return input > MIN_NO && input < MAX_NO;
    }

    public static boolean isThreeWord(String input) {
        return input.length() == 3;
    }
}

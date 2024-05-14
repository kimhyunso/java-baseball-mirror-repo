package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Computer {
    private Random random = new Random();
    private Balls comBalls;
    private static final int MAX_LENGTH = 3;
    private static final int MIN_LENGTH = 0;
    private static final int RANDOM_NUMBER = 9;

    public Computer(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = MIN_LENGTH; i < MAX_LENGTH; i++) {
            int randomNum = random.nextInt(RANDOM_NUMBER) + 1;

            if (!numbers.contains(randomNum)){
                numbers.add(randomNum);
            }

        }
        comBalls = new Balls(numbers);
    }

    public Balls generator(){
        return comBalls;
    }

}

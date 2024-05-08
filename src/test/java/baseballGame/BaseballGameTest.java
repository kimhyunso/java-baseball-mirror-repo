package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class BaseballGameTest {

    int baseBallGame[] = new int[3];

    @BeforeEach
    void setUp(){
        Random random = new Random();
        for (int i = 0; i<baseBallGame.length; i++){
            baseBallGame[i] = random.nextInt(10);
        }
    }

    @ParameterizedTest
    @ValueSource(ints={1, 2, 3})
    void baseBallGame(int ballNumber){
        // 1. 자리가 같고, 숫자가 같으면 스트라이크

    }
    
    
}

package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ComputerTest {

    @DisplayName("랜덤 값 생성 여부 확인")
    @Test
    void 랜덤값_생성여부확인(){
        Computer computer = new Computer();
        Balls result = computer.generator();
        assertThat(result).isNotNull();
    }

}

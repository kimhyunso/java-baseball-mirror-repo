package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
        // assertThat(actual).isEqualTo("test");
    }
    @Test
    public void splitTest(){
        String input = "1,2";
        String splitResult[] = input.split(",");
        assertThat(splitResult).contains("1");
        assertThat(splitResult).containsExactly("1", "2");
    }

    @Test
    public void substringTest(){
        String input = "(1,2)";
        String result = input.substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    public void charAtTest(){
        String input = "abc";
        
    }



}

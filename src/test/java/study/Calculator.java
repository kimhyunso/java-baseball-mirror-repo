package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Scanner;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculator {

    Scanner input;
    String value;

    
    @BeforeEach
    void setUp(){
        value = "6 + 6 / 2 - 3";
    }

    @Test
    void stringCalculator(){
        String[] words = value.split(" ");
        int wordsLeng = words.length-1;
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;

        // 1. 정렬 2 3 + 4 * 2 /
        // (1,2) (3,4) (5,6)
        for (int i=1; i<wordsLeng; i+=2){
            swap(words, i, i+1);
        }

        for (int i=0; i<=wordsLeng; i++){
            int preNum = 0;
            int postNum = 0;

            // 2. 숫자면 push
            try{
                stack.push(Integer.parseInt(words[i]));
            }catch(Exception e){
                // 3. 연산자면 pop(), pop()
                preNum = stack.pop();
                postNum = stack.pop();
                // 4. 연산자 판단 후 연산을 반환 받아 스택에 다시 집어넣기
                stack.push(operation(preNum, postNum, words[i]));
            }
        }
        result = stack.pop();
        assertThat(result).isEqualTo(3);
    }

    private int operation(int preNum, int postNum, String operation){
        int result = 0;
        if (operation.equals("+")){
            result = preNum + postNum;
        }else if (operation.equals("-")){
            result = Math.abs(preNum - postNum);
        }else if (operation.equals("*")){
            result = preNum * postNum;
        }else if (operation.equals("/")){
            result = preNum > postNum ? preNum / postNum : postNum / preNum;
        }
        return result;
    }


    private void swap(String[] words, int pre, int post){
        String temp = words[pre];
        words[pre] = words[post];
        words[post] = temp;
    }
    
}
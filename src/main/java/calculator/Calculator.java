package calculator;
import java.util.Stack;

public class Calculator {
    public static Stack<Integer> stack = new Stack<Integer>();
    private String[] words;

    public Calculator(String value){
        words = value.split(" ");
    }

    public int result(){
        // 1. 정렬 2 3 + 4 * 2 /
        // (1,2) (3,4) (5,6)
        for (int i=1; i<words.length-1; i+=2){
            swap(words, i, i+1);
        }

        for (int i=0; i<words.length; i++){
            int preNum = 0;
            int postNum = 0;
            exception(preNum, postNum, words, i);
        }
        
        return stack.pop();
    }

    private void exception(int preNum, int postNum, String[] words, int index){
        try{
            // 2. 숫자면 push
            stack.push(Integer.parseInt(words[index]));
        }catch(Exception e){
            // 3. 연산자면 pop(), pop()
            preNum = stack.pop();
            postNum = stack.pop();
            // 4. 연산자 판단 후 연산을 반환 받아 스택에 다시 집어넣기
            stack.push(operation(preNum, postNum, words[index]));
        }
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
            result = Math.max(preNum, postNum) / Math.min(preNum, postNum);
        }
        return result;
    }


    private void swap(String[] words, int pre, int post){
        String temp = words[pre];
        words[pre] = words[post];
        words[post] = temp;
    }

}

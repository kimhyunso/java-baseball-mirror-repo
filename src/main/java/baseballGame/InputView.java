package baseballGame;

import java.util.Scanner;

public class InputView {
    private BaseballGameLogic logic;
    private int predictBoard[] = new int[3];
    private Scanner input;
    public static boolean FLAG = true;

    public InputView(){
        input = new Scanner(System.in);
        logic = new BaseballGameLogic();
    }

    public void input(int[] baseballBoard){
        while(FLAG){
            System.out.print("숫자를 입력해주세요 : ");
            int predict = input.nextInt();
            
            getPredictBoard(predict);

            logic.startGame(predictBoard, baseballBoard);
        }
    }


    // 입력 받은 숫자를 3개의 단위로 쪼갠 후 배열에 집어넣는 작업
    private void getPredictBoard(int predict){
        predictBoard[0] = predict / 100;
        predict %= 100;
        predictBoard[1] = predict / 10;
        predict %= 10;
        predictBoard[2] = predict;
    }


}
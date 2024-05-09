package baseballGame;

import java.util.Scanner;

public class ResultView {

    private Scanner input;

    public ResultView(){
        input = new Scanner(System.in);
    }

    public void print(int strikeCount, int ballCount){
        // 1. 하나도 맞지 않았을 때
        nothingPrint(strikeCount, ballCount);

        // 2. 스트라이크 일때
        int newGame = strikePrint(strikeCount, ballCount);

        if (newGame != 1)
            basePrint(strikeCount, ballCount);
        
        if (newGame == 1)
            newGame();
    }

    private void basePrint(int strikeCount, int ballCount){
        if (ballCount != 0)
            System.out.printf("%d볼", ballCount);
        
        if (strikeCount != 0)
            System.out.printf("%d스트라이크", strikeCount);

        System.out.println();
    }

    private int strikePrint(int strikeCount, int ballCount){
        int newGame = 0;
        if (strikeCount == 3){
            InputView.FLAG = false;
            basePrint(strikeCount, ballCount);
            System.out.println("3개의 숫자를 모두 맞히셨습니다!! 게임 종료");
            System.out.println("게임을 새로 시작 하려면 1, 종료하려면 2를 입력하세요.");
            newGame = input.nextInt();
        }
        return newGame;
    }

    private void newGame(){
        InputView.FLAG = true;
    }
    

    private void nothingPrint(int strikeCount, int ballCount){
        if (strikeCount == 0 && ballCount == 0)
            System.out.print("nothing");
    }

}

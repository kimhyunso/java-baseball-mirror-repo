package baseballGame;

import java.util.Random;

public class BaseballGame {
    private int[] baseballGame = new int[3];
    private int[] predict = new int[3];
    private boolean[] result = new boolean[3];
    private Random random = new Random();
    private ResultView resultView;

    public BaseballGame(){
        for (int i=0; i<baseballGame.length; i++)
            baseballGame[i] = random.nextInt(10);
    }

    public int[] getBaseballGame() {
        return baseballGame;
    }

    public int[] getPredictGame(){
        return predict;
    }

    public void setPredictGame(int[] predict){
        this.predict = predict;
    }

    public void startGame(){
        for (int i=0; i<baseballGame.length; i++){
            // 1. baseballGame의 위치와 숫자가 일치하는지 확인 일치하면 result에 true


            // 2. 위치는 일치하지 않는데 숫자가 일치하는 경우

        }


    }

}

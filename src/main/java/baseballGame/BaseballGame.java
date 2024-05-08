package baseballGame;

import java.util.Random;

public class BaseballGame {
    private int[] baseballGame = new int[3];
    private int[] predict = new int[3];
    private Random random = new Random();

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
            equalsTo(i);
        }
    }

    private void equalsTo(int index){
        if (baseballGame[index] == predict[index]){
            
        }
    }
}

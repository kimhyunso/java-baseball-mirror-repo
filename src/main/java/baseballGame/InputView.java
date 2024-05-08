package baseballGame;

public class InputView {
    private BaseballGame baseballGame;

    public InputView(int[] predict){
        baseballGame.setPredictGame(predict);
        baseballGame.startGame();
    }

}
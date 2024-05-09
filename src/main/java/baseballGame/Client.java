package baseballGame;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        Random random = new Random();

        int[] baseballBoard = new int[3];
        for (int i=0; i<baseballBoard.length; i++)
            baseballBoard[i] = random.nextInt(9) + 1;

        inputView.input(baseballBoard);
    }
    
}

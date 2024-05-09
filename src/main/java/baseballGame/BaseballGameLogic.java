package baseballGame;

public class BaseballGameLogic {
    private int[] baseballBoard;
    private int[] predictBoard;
    private ResultView resultView;

    private int strikeCount = 0;
    private int ballCount = 0;

    public BaseballGameLogic(){
        resultView = new ResultView();
    }

    public void startGame(int[] predictBoard, int[] baseballBoard){
        this.predictBoard = predictBoard;
        this.baseballBoard = baseballBoard;

        ballCount = 0;
        strikeCount = 0;

        for (int i=0; i<baseballBoard.length; i++){
            logic(i);
        }

        resultView.print(strikeCount, ballCount);
    }


    private boolean strike(int subject, int part){
        if (subject == part && baseballBoard[subject] == predictBoard[part]){
            strikeCount ++;
            return true;
        }
        return false;
    }

    private boolean ball(int subject, int part){
        if (subject != part && baseballBoard[subject] == predictBoard[part]){
            ballCount++;
            return true;
        }
        return false;
    }

    private void logic(int subject){
        for (int part=0; part<baseballBoard.length; part++){
            // 1. 스트라이크 상황
            if (strike(subject, part))
                break;

            // 2. 볼인 상황
            if (ball(subject, part))
                break;
        }
    }

}

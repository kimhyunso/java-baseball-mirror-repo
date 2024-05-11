package baseball;

import java.util.Map;

public class BaseBall {
    private final Computer computer;

    public BaseBall(Computer computer) {
        this.computer = computer;
    }

    public BaseBallStatus play(Player player) {
        Map<Integer, Integer> com =  computer.getNumbers();
        Map<Integer, Integer> predict = player.getPredict();

        return BaseBallStatus.NOTHING;
    }
}

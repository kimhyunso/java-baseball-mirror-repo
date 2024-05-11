package baseball;

public class BaseBall {
    private final Computer computer;

    public BaseBall(Computer computer) {
        this.computer = computer;
    }

    public BaseBallStatus play(Player player) {
        return BaseBallStatus.NOTHING;
    }
}

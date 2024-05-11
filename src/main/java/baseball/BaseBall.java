package baseball;

public class BaseBall {
    private final Computer com;

    public BaseBall(Computer com) {
        this.com = com;
    }

    public BallStatus play(Player player) {
        if (isEquals(player)){
            return BallStatus.STRIKE;
        }

        return BallStatus.NOTHING;
    }

    private boolean isEquals(Player player) {
        return com.equals(player);
    }

}

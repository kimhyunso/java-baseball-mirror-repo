package baseball;

public class BaseBall {
    private final Computer com;

    public BaseBall(Computer com) {
        this.com = com;
    }

    public BallStatus play(Player player) {
        if (isMatchAll(player)){
            return BallStatus.STRIKE;
        }

        return BallStatus.NOTHING;
    }

    private boolean isMatchAll(Player player) {
        return com.matchAll(player);
    }


}

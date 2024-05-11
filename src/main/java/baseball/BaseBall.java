package baseball;

public class BaseBall {
    private final Computer com;

    public BaseBall(Computer com) {
        this.com = com;
    }

    public BallStatus play(Player player) {
        if (isStrike(player)){
            return BallStatus.STRIKE;
        }
        if (isBall(player)){
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isBall(Player player) {
        return com.getPosition() != player.getPosition() && com.getNumber() == player.getPosition();
    }

    private boolean isStrike(Player player) {
        return player.getNumber() == com.getNumber() && player.getPosition() == player.getPosition();
    }
}

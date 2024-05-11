package baseball;

import java.util.List;
import java.util.Objects;

public class Computer {

    private final List<?> balls;

    public <T> Computer(List<T> balls) {
        this.balls = balls;
    }

    public List<?> getBalls() {
        return balls;
    }

    public boolean matchAll(Player player) {
        return player.getPredict().containsAll(this.balls);
    }
}

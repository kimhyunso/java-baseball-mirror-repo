package baseball;

import java.util.List;

public class Computer {

    private final List<?> balls;

    public <T> Computer(List<T> balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

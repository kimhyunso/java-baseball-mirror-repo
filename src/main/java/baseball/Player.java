package baseball;

import java.util.List;

public class Player {

    private final List<?> predict;

    public <T> Player(List<T> predict) {
        this.predict = predict;
    }

    public List<?> getPredict() {
        return predict;
    }
}

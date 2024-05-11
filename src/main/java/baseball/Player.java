package baseball;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Player {
    private Map<Integer, Integer> predict;
    public <T> Player(List<T> list) {
        AtomicInteger index = new AtomicInteger(0);

        predict = list.stream()
                .collect(Collectors.toMap(
                    i -> index.getAndIncrement(),
                    value -> (int)value)
                );
    }

    public Map<Integer, Integer> getPredict() {
        return predict;
    }
}

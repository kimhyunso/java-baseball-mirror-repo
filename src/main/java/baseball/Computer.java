package baseball;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Computer {

    private Map<Integer, Integer> numbers;
    public <T> Computer(List<T> list) {
        AtomicInteger index = new AtomicInteger(0);

        numbers = list.stream()
                .collect(Collectors.toMap(
                        i -> index.getAndIncrement(),
                        value -> (int)value
                ));
    }

    public Map<Integer, Integer> getNumbers() {
        return numbers;
    }
}

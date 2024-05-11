package baseball;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Computer {

    private Map<?, ?> numbers;
    public <T> Computer(List<T> list) {
        numbers = list.stream()
                .collect(Collectors.toMap(
                        index -> index,
                        value -> value
                ));
    }
}

package baseball;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Player {
    private Map<?, ?> predict;
    public <T> Player(List<T> list) {
        predict = list.stream()
                .collect(Collectors.toMap(
                    index -> index,
                    value -> value)
                );
    }


}

package lotto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lotto {
    private final List<Integer> numbers;
    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private List<Integer> getNumbers(){
        return this.numbers;
    }

    // TODO: 추가 기능 구현
}

package programers.lv1;

import java.util.stream.IntStream;

public class Remainder {
    public int solution(int n) {
        return IntStream.range(2, n).filter(e -> n % e == 1).findAny().orElse(0);
    }
}

package programers.lv1;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NNumber {
    public long[] solution(int x, int n) {
        return LongStream.iterate(x, y -> y + x).limit(n).toArray();
    }
}

package programers.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Divisor {
    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(29);
        System.out.println(Arrays.toString(solution));
    }
}

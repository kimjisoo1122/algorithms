package programers.lv1;

import java.util.stream.IntStream;

public class FindPrime {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(2, n)
                .filter(i -> {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                        }
                    }
                    return isPrime;
                })
                .count();
    }

}

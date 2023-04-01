package programers.lv1;

import java.util.stream.IntStream;

public class DivisorSum {

    public static int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
    }

    public static void main(String[] args) {
        int solution = solution(12);
        System.out.println("solution = " + solution);

    }
}

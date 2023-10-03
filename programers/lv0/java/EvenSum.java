package programers.lv0.java;

import java.util.stream.IntStream;

public class EvenSum {
    public static int solution(int n) {
        return IntStream.rangeClosed(2, n).filter(i -> i % 2 == 0).sum();
    }

    public static void main(String[] args) {
        int solution = solution(30);
        System.out.println("solution = " + solution);
    }
}

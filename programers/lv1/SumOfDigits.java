package programers.lv1;

import java.util.Arrays;

public class SumOfDigits {
    public int solution(int n) {
        n = 123;
        System.out.println("Hello Java");

        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}

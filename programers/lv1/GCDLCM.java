package programers.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GCDLCM {
    // 최대공약수(GCD)는 Greatest Common Divisor,
    // 최소공배수(LCM)는 Least Common Multiple
    // 최대공약수는 주어진수들의 공통된 약수중에서 가장 큰 약수
    // 최소공배수는 주어진수들의 공통된 배수중에서 가장 작은 배수
    public int[] solution(int n, int m) {

        List<Integer> collect1 = IntStream.rangeClosed(1, n).filter(i -> n % i == 0).boxed().collect(Collectors.toList());
        List<Integer> collect2 = IntStream.rangeClosed(1, m).filter(i -> m % i == 0).boxed().collect(Collectors.toList());

        collect1.removeIf(Predicate.not(collect2::contains));
        int gcd = collect1.get(collect1.size() - 1);
        int lcm = n * m / gcd;
        return new int[]{gcd, lcm};
    }

    public static void main(String[] args) {
        GCDLCM gcdlcm = new GCDLCM();
        int[] solution = gcdlcm.solution(3, 12);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
}

package programers.lv1;

import java.util.Arrays;
import java.util.Comparator;

public class SaleApple {
    public static int solution(int k, int m, int[] score) {
        int[] arr = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int cnt = 0;
        int sum = 0;
        for (int j : arr) {
            cnt++;
            if (cnt == m) {
                sum += j * m;
                cnt = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int solution = solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println("solution = " + solution);
    }
}

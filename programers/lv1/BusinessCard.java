package programers.lv1;

import java.util.Arrays;
import java.util.Comparator;

public class BusinessCard {
    public int solution(int[][] sizes) {

        Integer max1 = Arrays.stream(sizes)
                .mapToInt(ints -> {
                    int maxNum = Math.max(ints[0], ints[1]);
                    int minNum = Math.min(ints[0], ints[1]);
                    ints[0] = maxNum;
                    ints[1] = minNum;
                    return maxNum;
                })
                .max()
                .orElse(0);

        Integer max2 = Arrays.stream(sizes)
                .map(ints -> ints[1])
                .max(Comparator.naturalOrder())
                .orElse(0);

        return max1 * max2;
    }

    public static void main(String[] args) {
        int solution = new BusinessCard().solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}});
        System.out.println("solution = " + solution);

    }
}

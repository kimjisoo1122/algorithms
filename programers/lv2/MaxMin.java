package programers.lv2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class MaxMin {
    public static String solution(String s) {
        String[] split = s.split(" ");
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(split).mapToInt(Integer::parseInt).sorted().summaryStatistics();
        return intSummaryStatistics.getMin() + " " + intSummaryStatistics.getMax();
    }

    public static void main(String[] args) {
        String solution = solution("-1 -2 -3 -4");
        System.out.println("solution = " + solution);
    }
}

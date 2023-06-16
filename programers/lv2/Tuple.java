package programers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Tuple {
    public static int[] solution(String s) {
        return Arrays.stream(s.split(",\\{"))
                .map(e -> e.replaceAll("[\\{\\}]", "").trim().split(","))
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .mapToInt(e -> Integer.parseInt(e.getKey()))
                .toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
        System.out.println("art = " + Arrays.toString(solution));
    }
}

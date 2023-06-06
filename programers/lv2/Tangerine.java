package programers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Tangerine {
    public static int solution(int k, int[] tangerine) {
        LinkedHashMap<Integer, Long> linkedHashMap = Arrays.stream(tangerine).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));

        int temp = 0;
        int answer = 0;
        for (Long value : linkedHashMap.values()) {
            temp += value;
            answer++;
            if (temp >= k) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        System.out.println("solution = " + solution);
    }
}

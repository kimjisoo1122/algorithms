package programers.lv2;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KakaoNews2 {
    public static int solution(String str1, String str2) {
        String words1 = str1.toUpperCase();
        String words2 = str2.toUpperCase();

        Map<String, Long> map1 = IntStream.range(0, words1.length() - 1)
                .mapToObj(i -> words1.substring(i, i + 2))
                .filter(s -> s.matches("[A-Z]{2}"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> map2 = IntStream.range(0, words2.length() - 1)
                .mapToObj(i -> words2.substring(i, i + 2))
                .filter(s -> s.matches("[A-Z]{2}"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int intersection = map1.entrySet().stream()
                .mapToInt(e -> {
                    if (map2.containsKey(e.getKey())) {
                        return Math.toIntExact(Math.min(e.getValue(), map2.get(e.getKey())));
                    } else {
                        return 0;
                    }
                })
                .sum();

        map1.forEach((k, v) -> map2.compute(k, (key, value) -> value == null ? v : Math.max(v, value)));

        int union = map2.values().stream().mapToInt(Long::intValue).sum();

        if (intersection == union) {
            return 65536;
        }
        return (int) Math.floor((intersection / (double) union) * 65536) ;
    }

    public static void main(String[] args) {
        int solution = solution("aa1+aa2", "AAAA12");


        boolean matches = "A1".matches("[A-Z]{2}");
        System.out.println("matches = " + matches);
        System.out.println("solution = " + solution);
    }
}

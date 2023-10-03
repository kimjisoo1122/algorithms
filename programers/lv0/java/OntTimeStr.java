package programers.lv0.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class OntTimeStr {
    public static String solution(String s) {
        Map<String, List<String>> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(s1 -> s1));
        Set<Map.Entry<String, List<String>>> entries = collect.entrySet();
        entries.stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());



        return "";
    }

    public static String solution2(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }


    public static void main(String[] args) {
        String abcabcadc = solution("hello");
        System.out.println("abcabcadc = " + abcabcadc);
    }
}

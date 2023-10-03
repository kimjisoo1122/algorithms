package programers.lv0.java;

import java.util.*;
import java.util.stream.Collectors;

public class DupString {
    public static String solution(String my_string) {
        String[] split = my_string.split("");
        String collect = Arrays.stream(split).distinct().collect(Collectors.joining());
        System.out.println("collect = " + collect);
        Set set = new LinkedHashSet(List.of(split));
        System.out.println("set = " + set);
        return String.join("", set);
    }

    public static void main(String[] args) {
        String solution = solution("We are the world");
        System.out.println("solution = " + solution);

        System.out.println("floor = " + 70 / 45.0);
    }
}

package programers.lv0.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse {
    public static int solution(String before, String after) {
        return before.chars().sum() == after.chars().sum() ? 1 : 0;
    }

    public static void main(String[] args) {
        int olleh = solution("allpe", "apple");
        System.out.println("olleh = " + olleh);
    }
}

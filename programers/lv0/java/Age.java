package programers.lv0.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Age {
    public static String solution(int age) {
        String[] arr = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        return Arrays.stream(String.valueOf(age).split("")).map(e -> arr[Integer.parseInt(e)]).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String solution = solution(100);
        System.out.println("solution = " + solution);
    }
}

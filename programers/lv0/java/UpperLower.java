package programers.lv0.java;

import java.util.stream.Collectors;

public class UpperLower {
    public static String solution(String my_string) {
        return my_string.chars().mapToObj(i -> {
//            Character.isLowerCase((char) i);
            int result = i >= 97 ? i - 32 : i + 32;
            return String.valueOf((char) result);
        }).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String solution = solution("aAbB");
        System.out.println("solution = " + solution);
    }

}

package programers.lv0.java;

import java.util.Arrays;

public class SortStr {
    public static String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String  solution = solution("heLLo");
        System.out.println("solution = " + solution);
    }
}

package programers.lv0;

import java.util.Arrays;

public class Find7 {
    public static int solution(int[] array) {
        return (int) Arrays.stream(array)
                .mapToObj(String::valueOf)
                .reduce(String::concat)
                .orElse("")
                .chars()
                .filter(i -> '7' == (char) i)
                .count();
    }

    public static void main(String[] args) {
        int[] array = {7, 77,777};
        int solution = solution(array);
        System.out.println("solution = " + solution);
    }
}

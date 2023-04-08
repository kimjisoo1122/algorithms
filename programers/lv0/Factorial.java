package programers.lv0;

import java.util.Arrays;

public class Factorial {
    public static String solution(String bin1, String bin2) {
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        String solution = solution("10", "11");
        System.out.println("solution = " + solution);
    }
}

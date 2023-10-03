package programers.lv0.java;

import java.util.Arrays;

public class FindNum {
    public static int solution(int num, int k)  {
        return ("-" + num).indexOf(String.valueOf(k));
    }

    public static void main(String[] args) {
        int solution = solution(29183, 1);
        System.out.println("solution = " + solution);
    }
}

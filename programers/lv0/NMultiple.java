package programers.lv0;

import java.util.Arrays;

public class NMultiple {
    public static int[] solution(int n, int[] numlist)  {
        return Arrays.stream(numlist).filter(e -> e % n == 0).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println("solution = " + Arrays.toString(solution));
    }
}

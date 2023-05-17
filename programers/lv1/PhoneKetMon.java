package programers.lv1;

import java.util.Arrays;

public class PhoneKetMon {
    public static int solution(int[] nums) {
        long count = Arrays.stream(nums).distinct().count();
        return Math.min(nums.length / 2, (int) count);
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{3, 3, 3, 2, 2, 2});
        System.out.println("solution = " + solution);
    }
}

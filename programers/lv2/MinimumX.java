package programers.lv2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumX {
    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int num = max;

        boolean flag = true;
        while (flag) {
            Set<Integer> set = new HashSet<>();
            flag = false;
            for (int i = 1; i <= Math.sqrt(max); i++) {
                if (max % i == 0) {
                    set.add(i);
                    set.add(max / i);
                }
            }
            for (int i = 0; i < arr.length - 1; i++) {
                if (set.add(arr[i])) {
                    max += num;
                    flag = true;
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{2,6,8,14});
        System.out.println("solution = " + solution);
    }
}

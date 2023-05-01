package programers.lv1;

import java.util.Arrays;

public class PlusMinus {
    public int solution(int[] a, int[] b) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i] * b[i];
        }
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        PlusMinus plusMinus = new PlusMinus();
        int solution = plusMinus.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        System.out.println("solution = " + solution);
    }
}

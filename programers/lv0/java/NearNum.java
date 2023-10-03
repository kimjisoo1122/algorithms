package programers.lv0.java;

import java.util.Arrays;

public class NearNum {
    public static int solution(int[] array, int n) {
        int[] arr = Arrays.copyOf(array, array.length + 1);
        arr[arr.length - 1] = n;
        Arrays.sort(arr);
        int findIdx = Arrays.binarySearch(arr, n);
        if (findIdx == 0) {
            return arr[1];
        } else if (findIdx == arr.length - 1) {
            return arr[findIdx - 1];
        }
        int prevAbs = Math.abs(arr[findIdx] - arr[findIdx - 1]);
        int nextAbs = Math.abs(arr[findIdx + 1] - arr[findIdx]);
        return prevAbs <= nextAbs ? arr[findIdx - 1] : arr[findIdx + 1];
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{10, 11, 12}, 20);
        System.out.println("solution = " + solution);
    }
}

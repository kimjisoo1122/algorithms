package programers.lv2;

import java.util.Arrays;

public class H_index {
    public static int solution(int[] citations) {
        Arrays.sort(citations);

        for (int i = 0, j = citations.length; i < citations.length; i++,j--) {
            int num = citations[i];
            if (num >= j) {
                return j;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int solution = solution(new int[]{3, 0, 6, 1, 5});
        System.out.println("solution = " + solution);
    }
}

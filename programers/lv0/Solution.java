package programers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        if ("right".equals(direction)) {
            list.add(numbers[numbers.length - 1]);
            for (int i = 0; i < numbers.length - 1; i++) {
                list.add(numbers[i]);
            }
        } else {
            for (int i = 1; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{4, 455, 6, 4, -1, 45, 6},  "right");
        System.out.println(Arrays.toString(solution));

    }
}

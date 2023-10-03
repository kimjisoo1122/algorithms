package programers.lv0.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNum {
    public static int[] solution(int[] array) {
        String maxNum =  String.valueOf(Arrays.stream(array).max().orElse(0));
        List<String> s1 = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.toList());
        return new int[]{Integer.parseInt(maxNum), s1.indexOf(maxNum)};
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{9, 10, 11, 8});
        System.out.println("solution = " + Arrays.toString(solution));

    }
}

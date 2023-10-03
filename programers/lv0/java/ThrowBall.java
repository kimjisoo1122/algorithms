package programers.lv0.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThrowBall {
    public int solution(int[] numbers, int k) {
        int idx = (k - 1) * 2;
        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        List<Integer> list = new ArrayList<>(numbersList);
        while (list.size() - 1 < idx) {
            list.addAll(numbersList);
        }
        return list.get(idx);
    }

    public static void main(String[] args) {
        ThrowBall throwBall = new ThrowBall();
        int solution = throwBall.solution(new int[]{1, 2, 3, 4, 5, 6}, 5);
        System.out.println("solution = " + solution);
    }
}

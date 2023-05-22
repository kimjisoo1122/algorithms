package programers.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uniform {
    public static int solution(int n, int[] lost, int[] reserve) {
        List<Integer> list = Arrays.stream(reserve)
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        Arrays.sort(lost);
        int answer = n - lost.length;
        for (Integer i : lost) {
            Integer next = i + 1;
            Integer prev = i - 1;
            if (list.remove(i) ||  list.remove(next) || list.remove(prev)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        System.out.println("solution = " + solution);
    }

}

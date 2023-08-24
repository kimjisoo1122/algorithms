package programers.lv2;

import java.util.*;
import java.util.stream.Collectors;

public class Heap {
    public static int solution(int[] scoville, int K) {
        Arrays.sort(scoville);

        Deque<Integer> deque = Arrays.stream(scoville)
                .filter(i -> i < K)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));

        if (deque.size() == 0) {
            return 0;
        }

        if (deque.size() < scoville.length) {
            deque.add(scoville[deque.size()]);
        }

        int cnt = 0;
        while (deque.size() >= 2) {
            Integer first = deque.pollFirst();
            Integer second = deque.pollFirst();

            int num1 = Math.min(first, second);
            int num2 = Math.max(first, second);

            if (num1 >= K) {
                return cnt;
            }

            int addScoville = num1 + (num2 * 2);
            deque.addFirst(addScoville);

            cnt++;
        }

        return deque.pop() >= K ? cnt : -1;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 3, 9, 10, 12}, 50);
        System.out.println("solution = " + solution);
    }
}

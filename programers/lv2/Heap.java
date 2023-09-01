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

        if (deque.isEmpty()) {
            return 0;
        }

        if (deque.size() < scoville.length) {
            deque.add(scoville[deque.size()]);
        }

        int cnt = 0;
        while (deque.size() >= 2) {
            Integer firstPoll = deque.pollFirst();
            Integer secondPoll = deque.pollFirst();

            int firstNum = Math.min(firstPoll, secondPoll);
            int secondNum = Math.max(firstPoll, secondPoll);

            if (firstNum >= K) {
                return cnt;
            }

            int addScoville = firstNum + (secondNum * 2);
            deque.add(addScoville);
            deque = deque.stream().sorted().collect(Collectors.toCollection(ArrayDeque::new));

            cnt++;
        }

        return deque.pop() >= K ? cnt : -1;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println("solution = " + solution);
    }
}

package programers.lv2;

import java.util.*;
import java.util.stream.Collectors;

public class Process {
    public static int solution(int[] priorities, int location) {
        ArrayDeque<Integer> deque = Arrays.stream(priorities)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Character> charDeque = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            charDeque.add((char) ('A' + i));
        }

        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int num = 1;
        while (!deque.isEmpty()) {
            max = deque.stream().max(Comparator.naturalOrder()).orElse(0);
            Integer poll = deque.poll();
            Character charPoll = charDeque.poll();
            if (poll != max) {
                deque.add(poll);
                charDeque.add(charPoll);
            } else {
                map.put(charPoll, num);
                num++;
            }
        }
        return map.get((char) ('A' + location));
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println("solution = " + solution);
    }
}

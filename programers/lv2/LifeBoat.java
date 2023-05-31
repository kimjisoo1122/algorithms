package programers.lv2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class LifeBoat {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        ArrayDeque<Integer> deque = new ArrayDeque<>(50001);
        for (int i = people.length - 1; i >= 0; i--) {
            deque.add(people[i]);
        }

        int boat = 0;
        while (!deque.isEmpty()) {
            Integer min = deque.getLast();
            if (min + deque.pop() <= limit) {
                deque.pollLast();
            }
            boat++;
        }
        return boat;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println("solution = " + solution);

        int solution1 = new Solution().solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println("solution1 = " + solution1);
    }
}


class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        for (; i < j; --j) {
            if (people[i] + people[j] <= limit)
                ++i;
        }
        return people.length - i;
    }
}
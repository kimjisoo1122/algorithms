package programers.lv2;

import java.util.ArrayDeque;
import java.util.HashSet;

public class CircleArr {
    public static int solution(int[] elements) {
        int[] arr = new int[elements.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elements[i % elements.length];
        }

        HashSet<Object> set = new HashSet<>();
        int cnt = 1;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < elements.length; i++) {
            int num = 0;
            for (int j = 0; j < elements.length + (cnt - 1); j++) {
                deque.add(arr[j]);
                num += arr[j];
                if (deque.size() == cnt) {
                    set.add(num);
                    num -= deque.pollFirst();
                }
            }
            cnt++;
            deque.clear();
        }
        return set.size();
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{7, 9, 1, 1, 4});
        System.out.println("solution = " + solution);
    }
}

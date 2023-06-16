package programers.lv2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Progresses {
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainProgress = 100 - progresses[i];
            int duration = (int) Math.ceil((double) remainProgress / speeds[i]);

            Integer peekFirst = deque.peekFirst();
            if (peekFirst == null || peekFirst >= duration) {
                deque.add(duration);
            } else {
                list.add(deque.size());
                deque.clear();
                deque.add(duration);
            }
        }
        list.add(deque.size());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        System.out.println("solution = " + Arrays.toString(solution));
    }
}

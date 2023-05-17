package programers.lv1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFrame {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            if ((i + 1) > k) {
                queue.remove();
            }
            answer[i] = queue.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

package programers.lv1;

import java.util.Arrays;

public class Knum {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIdx = 0;
        for (int[] command : commands) {
            int start = command[0] - 1;
            int end = command[1];
            int idx = command[2] - 1;

            int[] copyOfRange = Arrays.copyOfRange(array , start, end);
            Arrays.sort(copyOfRange);
            answer[answerIdx++] = copyOfRange[idx];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

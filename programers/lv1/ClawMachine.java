package programers.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ClawMachine {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                int num = board[i][move - 1];
                if (num != 0) {
                    board[i][move - 1] = 0;
                    if (stack.isEmpty()) {
                        stack.push(num);
                        break;
                    }
                    if (stack.peek().equals(num)) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(num);
                    }
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int solution = solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1,5,3,5,1,2,1,4});
        System.out.println("solution = " + solution);




    }
}

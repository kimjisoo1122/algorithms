package programers.lv1;

import java.util.Stack;

public class MakeHamBurger {
    public static int solution(int[] ingredient) {

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int in : ingredient) {
            stack.push(in);
            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 4) == 1 &&
                    stack.get(stack.size() - 3) == 2 &&
                    stack.get(stack.size() - 2) == 3 &&
                    stack.get(stack.size() - 1) == 1) {

                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println("solution = " + solution);
    }
}

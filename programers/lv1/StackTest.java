package programers.lv1;

import java.util.Arrays;
import java.util.Stack;

public class StackTest {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i : arr) {
            if (stack.peek() != i) {
                stack.push(i);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        StackTest stack = new StackTest();
        int[] solution = stack.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

package programers.lv2;

import java.util.Arrays;
import java.util.Stack;

public class WordChain {
    public static int[] solution(int n, String[] words) {
        int cnt = 0;
        int floor = 1;
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            cnt++;
            if (stack.isEmpty()) {
                stack.push(word);
            } else {
                String peek = stack.peek();
                char last = peek.charAt(peek.length() - 1);
                char first = word.charAt(0);
                if (last != first || stack.contains(word)) {
                    return new int[]{cnt, floor};
                } else {
                    stack.push(word);
                }
            }

            if (cnt == n) {
                cnt = 0;
                floor ++;
            }
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] solution = solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        System.out.println("art = " + Arrays.toString(solution));

    }
}

package programers.lv2;

import java.util.Stack;

public class TwinPop {
    public static int solution(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                Character peek = stack.peek();
                if (c == peek) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        int baabaa = solution("baabaa");
        System.out.println("baabaa = " + baabaa);
    }
}

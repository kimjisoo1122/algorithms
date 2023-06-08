package programers.lv2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;

public class Circle {
    public static int solution(String s) {

        LinkedList<String> linkedList = Arrays.stream(s.split(""))
                .map(s1 ->
                        s1.replaceAll("[\\[]", "3").replaceAll("[\\]]", "-3")
                          .replaceAll("[{]", "2").replaceAll("[}]", "-2")
                          .replaceAll("[(]", "1").replaceAll("[)]", "-1"))
                .collect(Collectors.toCollection(LinkedList::new));

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            for (String value : linkedList) {
                int num = Integer.parseInt(value);
                if (num < 0) {
                    if (stack.isEmpty()) {
                        answer++;
                        break;
                    }
                    Integer prevNum = stack.peek();
                    if (num + prevNum == 0) {
                        stack.pop();
                    } else {
                        answer++;
                        stack.clear();
                        break;
                    }
                } else {
                    stack.push(num);
                }
            }
            linkedList.addLast(linkedList.pollFirst());
            if (!stack.isEmpty()) {
                answer++;
            }
        }
        return s.length() - answer;
    }

    public static void main(String[] args) {
        int solution = solution("[](){}");
        System.out.println("solution = " + solution);
    }
}

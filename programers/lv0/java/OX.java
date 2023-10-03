package programers.lv0.java;

import java.util.Arrays;

public class OX {

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; quiz.length > i; i++) {
            String[] arr = quiz[i].split(" ");

            boolean result;
            if (arr[1].equals("-")) {
                result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]);
            } else {
                result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4]);
            }
            answer[i] = result ? "O" : "X";
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] solution = solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        System.out.println(Arrays.toString(solution));

    }
}

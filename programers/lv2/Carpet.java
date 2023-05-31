package programers.lv2;

import java.util.Arrays;

public class Carpet {
    public static int[] solution(int brown, int yellow) {

        int sum = brown + yellow;
        int[] answer = new int[2];
        for (int i = 3; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                if ((sum / i - 2) * (i - 2) == yellow) {
                    answer[0] = sum / i;
                    answer[1] = i;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(24, 24);
        System.out.println("art = " + Arrays.toString(solution));
    }

}

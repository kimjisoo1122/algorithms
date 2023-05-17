package programers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NearStr {
    public static int[] solution(String s) {
        String[] split = s.split("");
        int[] answer = new int[s.length()];
        List<String> collect = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (collect.contains(split[i])) {
                answer[i] = i - collect.lastIndexOf(split[i]);
            } else {
                answer[i] = -1;
            }
            collect.add(split[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] bananas = solution("banana");
        System.out.println("art = " + Arrays.toString(bananas));
    }
}

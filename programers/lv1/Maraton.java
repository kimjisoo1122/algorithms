package programers.lv1;

import java.util.Arrays;

public class Maraton {
    public static String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }

    public static void main(String[] args) {
        String solution = solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}
        ,new String[]{"josipa", "filipa", "marina", "nikola"});
        System.out.println("solution = " + solution);
    }
}

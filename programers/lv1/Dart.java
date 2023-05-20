package programers.lv1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dart {
    public static int solution(String dartResult) {

        Pattern pattern = Pattern.compile("(\\d+)([SDT])([*#])?");
        Matcher matcher = pattern.matcher(dartResult);
        int[] answer = new int[3];
        int currentIdx = -1;

        while (matcher.find()) {
            currentIdx++;
            int score = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2);
            String option = matcher.group(3);

            if ("D".equals(bonus)) {
                score = (int) Math.pow(score, 2);
            } else if ("T".equals(bonus)) {
                score = (int) Math.pow(score, 3);
            }

            if ("*".equals(option)) {
                if (currentIdx > 0) {
                    score *= 2;
                    answer[currentIdx - 1] *= 2;
                } else {
                    score *= 2;
                }
            } else if ("#".equals(option)) {
                score *= -1;
            }

            answer[currentIdx] = score;
        }


        return Arrays.stream(answer).sum();
    }

    public static void main(String[] args) {
        int solution = solution("1D2S#*10S");
        System.out.println("solution = " + solution);
    }
}

package programers.lv0;

import java.util.Arrays;

public class CalStr {
    public static int solution(String my_string) {
        String[] split = my_string.split(" ");
        int[] ints = Arrays.stream(split).filter(s -> {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }).mapToInt(Integer::parseInt).toArray();
        int cnt = split.length - ints.length;

        int answer = Integer.parseInt(split[0]);
        int num = 1;
        for (int i = 0; i < cnt; i++) {
            if ("+".equals(split[num])) {
                answer += Integer.parseInt(split[num + 1]);
            } else {
                answer -= Integer.parseInt(split[num + 1]);
            }
            num += 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution("3 + 4 - 9 + 15 + 11");
        System.out.println("solution = " + solution);

    }

}

package programers.lv1;

import java.util.Arrays;
import java.util.Comparator;

public class IdxStrSort {
    public static String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(Comparator.comparing((String s) -> s.charAt(n)).thenComparing(Comparator.naturalOrder()))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] solution = solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println("solution = " + solution);

    }
}

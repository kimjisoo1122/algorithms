package programers.lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StarngeWord {
    public String solution(String s) {
        return Arrays.stream(s.split(" "))
                .map(s2 -> {
                    String[] split = s2.split("");
                    for (int i = 0; i < split.length; i++) {
                        System.out.println("s2 = " + s2);
                        if (i % 2 == 0) {
                            split[i] = split[i].toUpperCase();

                        } else {
                            split[i] = split[i].toLowerCase();
                        }
                    }
                    return String.join("", split);
                })
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String solution = new StarngeWord().solution(" try hello world");
        System.out.println("solution = " + solution);
    }
}

package programers.lv1;

import java.util.stream.Collectors;

public class SecretCode {
    public static String solution(String s, String skip, int index) {
        return s.chars()
                .mapToObj(i -> {
                    char c = (char) i;
                    int cnt = 0;
                    if (Character.isUpperCase(c)) {
                        while (cnt < index) {
                            c += 1;
                            c = c == 'a' ? 'A' : c;
                            if (skip.indexOf(c) == -1) {
                                cnt++;
                            }

                        }
                    } else {
                        while (cnt < index) {
                            c += 1;
                            c = c == 'z' + 1 ? 'a' : c;
                            if (skip.indexOf(c) == -1) {
                                cnt++;
                            }
                        }
                    }
                    return String.valueOf(c);
                })
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String solution = solution("aukks", "wbqd", 5);
        System.out.println("solution = " + solution);
    }
}

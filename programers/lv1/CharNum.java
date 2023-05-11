package programers.lv1;

import java.util.stream.Collectors;

public class CharNum {
    public static String solution(String s, int n) {
        return s.chars().map(i -> {
                    if (i == 32) return i;
                    char c = (char) i;
                    int addNum = i + n;
                    if (Character.isUpperCase(c)) {
                        if (addNum > 'Z') {
                            i = 'A' + (addNum - 'Z' - 1);
                        } else {
                            i = addNum;
                        }
                    } else {
                        if (addNum > 'z') {
                            i = 'a' + (addNum - 'z' - 1);
                        } else {
                            i = addNum;
                        }
                    }
                    return i;
                })
                .mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String aBZ = solution("a B z", 4);
        System.out.println("aBZ = " + aBZ);
    }
}

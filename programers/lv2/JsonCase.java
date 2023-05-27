package programers.lv2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class JsonCase {
    public static String solution(String s) {
        String lowerCase = s.toLowerCase();
        Pattern pattern = Pattern.compile("^[\\S]");

        return Arrays.stream(lowerCase.split(" "))
                .map(str -> {
                    System.out.println("str = " + str);
                    Matcher matcher = pattern.matcher(str);
                    String firstWord = matcher.group();
                    return str.replace(firstWord, firstWord.toUpperCase());
                })
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String solution = solution("3people unFollowed me");
        System.out.println("solution = " + solution);
    }
}

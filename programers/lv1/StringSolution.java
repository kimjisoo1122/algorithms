package programers.lv1;

import java.util.regex.Pattern;

public class StringSolution {
    public boolean solution(String s) {
        return Pattern.matches("^\\d{4}(\\d{2})?$", s);
    }

    public static void main(String[] args) {
        StringSolution stringSolution = new StringSolution();
        boolean solution = stringSolution.solution("a234");
        System.out.println("solution = " + solution);
    }
}

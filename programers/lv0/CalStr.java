package programers.lv0;

import java.util.Arrays;

public class CalStr {
        public static int solution(String my_string) {

            String[] s = my_string.replace("- ", "-").replaceAll("[+] ", "").split(" ");
            return Arrays.stream(s).mapToInt(Integer::parseInt).sum();
        }

    public static void main(String[] args) {
        int solution = solution("3 + 4 - 9 + 15 + 11");
        System.out.println("solution = " + solution);

    }

}

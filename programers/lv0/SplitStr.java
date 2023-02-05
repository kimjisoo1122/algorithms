package programers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitStr {

    public static String[] solution(String my_str, int n) {

        int arrSize = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] result = new String[arrSize];

        for (int i = 0; i < arrSize; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length());
            result[i] = my_str.substring(start, end);
        }
        return result;
    }

    public static void main(String[] args) {

        String[] result = solution("abcdef123", 3);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}

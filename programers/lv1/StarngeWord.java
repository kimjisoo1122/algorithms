package programers.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StarngeWord {
    public String solution(String s) {
        String[] arr = s.split(" ");
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            String[] split = arr[i].split("");
            for (int j = 0; j < split.length; j++) {
                if (split[j].isEmpty()) {
                    flag = false;
                    continue;
                }
                if (flag) {
                    split[j] = split[j].toUpperCase();
                    flag = false;
                } else {
                    split[j] = split[j].toLowerCase();
                    flag = true;
                }
            }
            arr[i] = String.join("", split);
        }
        return String.join("", arr);
    }

    public static void main(String[] args) {
        String solution = new StarngeWord().solution("try  hello world");
        System.out.println("solution = " + solution);
    }
}

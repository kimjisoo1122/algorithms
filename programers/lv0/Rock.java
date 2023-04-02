package programers.lv0;

import java.util.Arrays;

public class Rock {
    public static String solution(String rsp) {
        String[] arr = new String[6];
        arr[2] = "0";
        arr[0] = "5";
        arr[5] = "2";

        StringBuilder sb = new StringBuilder();
        String[] split = rsp.split("");
        for (String s : split) {
            sb.append(arr[Integer.parseInt(s)]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String solution = solution("205");
        System.out.println("solution = " + solution);
    }
}

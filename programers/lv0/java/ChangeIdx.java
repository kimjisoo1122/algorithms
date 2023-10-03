package programers.lv0.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ChangeIdx {
    public static String solution(String my_string, int num1, int num2) {
//        char[] temp = my_string.toCharArray();
//        temp[num1] = my_string.charAt(num2);
//        temp[num2] = my_string.charAt(num1);
//        return String.valueOf(temp);
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }


    public static void main(String[] args) {
        String solution = solution("hello", 1 , 2);
        System.out.println("solution = " + solution);

    }
}

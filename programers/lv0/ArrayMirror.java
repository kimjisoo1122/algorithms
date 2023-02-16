package programers.lv0;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayMirror {
    public static int solution(String[] s1, String[] s2) {
        HashSet<String> collect = new HashSet<>(Arrays.asList(s1));
        return (int) Arrays.stream(s2).filter(collect::contains).count();
    }

    public static void main(String[] args) {
        int solution = solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
        System.out.println("solution = " + solution);
    }
}

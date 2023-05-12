package programers.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringSolution {
    public int solution(String t, String p) {


        List<String> list = new ArrayList<>();
        String[] split = t.split("");
        for (int i = 0; i < split.length - (p.length() - 1); i++) {
            StringBuilder sb = new StringBuilder();
            IntStream.range(i, i + p.length())
                    .forEach(k -> sb.append(split[k]));
            list.add(sb.toString());
        }
        return (int) list.stream().filter(i -> i.compareTo(p) <= 0).count();
    }

    public static void main(String[] args) {
        StringSolution stringSolution = new StringSolution();
        int solution = stringSolution.solution("3141592525", "271233");
        System.out.println("solution = " + solution);
    }
}

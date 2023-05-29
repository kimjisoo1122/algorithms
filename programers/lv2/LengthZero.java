package programers.lv2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthZero {
    public static int[] solution(String s) {
        if (s.equals("1")) return new int[]{1, 0};

        Map<String, Long> map = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

        int cnt = 0;

        while (!s.equals("1")) {
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            Arrays.stream(s.split(""))
                    .forEach(str -> {
                        if (str.equals("0")) {
                            Long ifAbsent = map.putIfAbsent("0", 1L);
                            if (ifAbsent != null) {
                                map.put("0", ifAbsent + 1L);
                            }
                        }
                    });
            cnt++;
        }

        return new int[]{cnt, Math.toIntExact(map.getOrDefault("0", 0L))};
    }

    public static void main(String[] args) {
        int[] solution = solution("110010101001");
        System.out.println("art = " + Arrays.toString(solution));
    }
}

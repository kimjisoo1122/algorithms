package programers.lv1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhotoPoint {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
//        HashMap<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < name.length; i++) {
//            map.put(name[i], yearning[i]);
//        }

        Map<String, Integer> map = IntStream.range(0, name.length)
                .boxed()
                .collect(Collectors.toMap(i -> name[i], i -> yearning[i]));

        return Arrays.stream(photo)
                .flatMapToInt(strings -> {
                    int sum = 0;
                    for (String string : strings) {
                        sum += map.getOrDefault(string, 0);
                    }
                    return IntStream.of(sum);
                }).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

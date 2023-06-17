package programers.lv2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MarketDiscount {
    public static int solution(String[] want, int[] number, String[] discount) {

        Map<String, Long> map = Arrays.stream(discount)
                .limit(10)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        int day = 0;
        int cnt = 0;

        while (day <= discount.length - 10) {
            boolean flag = true;
            for (int i = 0; i < want.length; i++) {
                Long discountQuantity = map.get(want[i]);
                if (discountQuantity == null || discountQuantity < number[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) cnt++;

            if (discount.length > 10 + day) {
                map.computeIfPresent(discount[day], (k, v) -> Math.max(0, v - 1));
                Long ifAbsent = map.putIfAbsent(discount[10 + day], 1L);
                if (ifAbsent != null) {
                    map.put(discount[10 + day], ifAbsent + 1);
                }
            }
            day++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int solution =
                solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                        new int[]{3, 2, 2, 1, 1},
                        new String[]{"chicken", "apple", "apple",
                                "banana", "rice", "apple", "pork", "banana",
                                "pork", "rice", "pot", "banana", "apple", "banana"});

        System.out.println("solution = " + solution);
    }
}

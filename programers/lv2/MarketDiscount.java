package programers.lv2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MarketDiscount {
    public static int solution(String[] want, int[] number, String[] discount) {

        for (int i = 0; i < want.length ; i++) {
            want[i] = want[i].repeat(number[i]);
        }

        int answer = 0;
        for (int i = 0; i < discount.length; i++) {
            String discounts = Arrays.stream(discount)
                    .skip(i)
                    .limit(10)
                    .sorted()
                    .collect(Collectors.joining());
            int cnt = 0;
            for (String item : want) {
                if (discounts.contains(item)) {
                    cnt++;
                }
            }
            if (cnt == want.length) {
                answer = i + 1;
                break;
            }
        }
        return answer;
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

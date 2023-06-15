package programers.lv2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Cloth {
    public static int solution(String[][] clothes) {
        // 안입는 경우의 수를 구하려면 각 갯수에 + 1을 해서 서로의 곱을 해주면 된다
        // 문제는 최소1개는 입어야하기에 다 안입는 경우 한가지를 제외해준다

        return Arrays.stream(clothes)
                .collect(Collectors.groupingBy(e -> e[1], Collectors.counting()))
                .values()
                .stream()
                .reduce(1L, (x, y) -> x * (y + 1))
                .intValue() - 1;
    }

    public static void main(String[] args) {
        int solution = solution(new String[][]{
                {"yellow_hat", "headgear"}, {"green_turban", "headgear"}, {"green_turban2", "headgear"},
                {"blue_sunglasses", "eyewear"}, {"blue_sunglasses2", "eyewear"},
                {"yellow_shirt", "top"}, {"yellow_shirt2", "top"}});

        // 7 + 6 + 6 + 4  + 12
        System.out.println("solution = " + solution);
    }
}

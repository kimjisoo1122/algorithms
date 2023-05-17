package programers.lv1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FoodFight {
    public static String solution(int[] food) {
        String collect = IntStream.range(1, food.length)
                .mapToObj(i -> String.valueOf(i).repeat(food[i] / 2))
                .collect(Collectors.joining());
        return collect + "0" + new StringBuilder(collect).reverse();
    }

    public static void main(String[] args) {
        String solution = solution(new int[]{1, 3, 4, 6});
        System.out.println("solution = " + solution);
    }
}

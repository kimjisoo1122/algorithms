package programers.lv1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Emoticons {
    public static int[] solution(int[][] users, int[] emoticons) {
        //  할인율, 최대한도 (넘어가면 이모티콘플러스) 이모티콘 가격
        IntStream userDiscouts = Arrays.stream(users).mapToInt(t -> t[0]);
        int minDiscount = Arrays.stream(users).mapToInt(t -> t[0]).min().orElse(0);
        Map<Integer, List<int[]>> collect = Arrays.stream(users).collect(Collectors.groupingBy(t -> t[0]));

        List<Integer> discountRates = Stream.of(10, 20, 30, 40).filter(t -> t > minDiscount).collect(Collectors.toList());

        for (Integer discountRate : discountRates) {
            double discount = 1 - (double) discountRate / 100;
            for (Map.Entry<Integer, List<int[]>> entry : collect.entrySet()) {
                Map<Integer, int[]> map = new HashMap<>();
                int userDiscount = entry.getKey();
                int userMoney = entry.getValue().get(0)[1];
                if (userDiscount <= discountRate) {
                    int sum = 0;
                    int plus = 0;
                    int total = 0;
                    for (int emoticon : emoticons) {
                        int discountEmoticon = (int) (emoticon * discount);
                        sum += discountEmoticon;
                    }
                    if (sum >= userMoney) {
                        plus++;
                    } else {
                        total = sum;
                    }
                    int[] ints = {plus, total};
                    map.put(userDiscount, ints);
                }
                for (Map.Entry<Integer,int[]> integerEntry : map.entrySet()) {
                    System.out.println("integerEntry.getKey() = " + integerEntry.getKey());
                    System.out.println("integerEntry.getValue() = " + Arrays.toString(integerEntry.getValue()));
                }
            }

        }



        // 결과는 이모티콘플러스가입자수, 이모티콘 판매액
        return null;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[][]{{40, 10000}, {25, 10000}}, new int[]{7000, 9000});
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
}

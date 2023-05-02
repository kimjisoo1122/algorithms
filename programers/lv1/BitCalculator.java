package programers.lv1;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class BitCalculator {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String formatter = "%" + n + "s";
        IntFunction<String> objectIntFunction = i -> {
            String format = String.format(formatter, Integer.toString(i, 2));
            return format.replace(" ", "0");
        };

        List<String> collect1 =
                Arrays.stream(arr1).mapToObj(objectIntFunction).collect(Collectors.toList());
        List<String> collect2 =
                Arrays.stream(arr2).mapToObj(objectIntFunction).collect(Collectors.toList());

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int a1 = Integer.parseInt(collect1.get(i), 2);
            int a2 = Integer.parseInt(collect2.get(i), 2);
            int a3 = a1 | a2;
            String s = String.format(formatter, Integer.toString(a3, 2));
            answer[i] = s.replace("0", " ").replaceAll("\\d", "#");
        }
        return answer;
    }

    public static void main(String[] args) {
        BitCalculator bitCalculator = new BitCalculator();
        String[] solution = bitCalculator.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

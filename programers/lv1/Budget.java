package programers.lv1;

import java.util.Arrays;

public class Budget {
    public static int solution(int[] d, int budget) {

        Arrays.sort(d);
        int sum = 0;
        int result = 0;
        for (int num : d) {
            sum += num;
            if (sum > budget) {
                break;
            }
            result++;
        }
        return result;

//        // 배열을 오름차순 정렬한다.
//        List<Integer> collect = Arrays.stream(d).sorted().boxed().collect(Collectors.toList());
//        int sum = collect.stream().mapToInt(Integer::intValue).sum();
//        int result = collect.size();
//        // 예산의 경우의 수중 오름찬순으로 정렬한값을 합친값보다 높은 경우의 수는 존재하지 않는다.
//        while (sum > budget) {
//            collect.remove(collect.size() - 1);
//            sum = collect.stream().mapToInt(Integer::intValue).sum();
//            result = collect.size();
//        }
//        return result;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println("solution = " + solution);
    }
}

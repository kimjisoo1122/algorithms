package programers.lv1;

import java.util.*;

public class ArrAdd2 {
    public static int[] solution(int[] numbers) {
        long startTime = System.currentTimeMillis();
        Set<Integer> list = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        // tree set은 이진트리구조로 set의 중복을 저장하지않는요소에  정렬기능을 제공한다.
        // 잦은 삽입 삭제가 있는 set구조에선 hash구조의 hashset
        // 정렬이 필요하면 treeset
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{2, 1, 3, 4, 1});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

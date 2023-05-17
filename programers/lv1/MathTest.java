package programers.lv1;

import java.util.*;

public class MathTest {
    public static int[] solution(int[] answers) {
        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[][] persons = new int[][]{person1, person2, person3};

        Map<Integer, List<Integer>> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < persons.length; i++) {
            List<Integer> list = new ArrayList<>();
            int correct = 0;
            for (int j = 0; j < answers.length; j++) {
                if (persons[i][j % persons[i].length] == answers[j]) {
                    correct++;
                }
            }
            list.add(i + 1);
            List<Integer> absent = map.putIfAbsent(correct, list);
            // 기존값이 있으면 기존값을 가져오고 없으면 null
            if (absent != null) {
                absent.add(i + 1);
            }
        }
        List<Integer> list = map.values().stream().findFirst().orElseGet(Collections::emptyList);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] solution = solution(new int[]{1,2,3,4,5});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

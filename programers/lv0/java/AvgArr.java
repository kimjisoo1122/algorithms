package programers.lv0.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AvgArr {
    public int[] solution(int[][] score) {

        List<Integer> scoreList = Arrays.stream(score).map(ints -> ints[0] + ints[1]).collect(Collectors.toList());
        List<Integer> orderdList = new ArrayList<>(scoreList);
        orderdList.sort(Comparator.reverseOrder());

        int[] answer = new int[scoreList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = orderdList.indexOf(scoreList.get(i)) + 1;
        }
        return answer;
    }
    public static void main(String[] args) {

        AvgArr avgArr = new AvgArr();
        int[] solution = avgArr.solution(new int[][]{{80,70},{90, 50},{40, 70},{50, 80}});
        System.out.println(Arrays.toString(solution));
    }
}

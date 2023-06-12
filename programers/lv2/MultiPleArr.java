package programers.lv2;

import java.util.Arrays;

public class MultiPleArr {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1의 행과 arr2의 열의 곱이 행렬곱셋의 배열 크기

        // answer[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0]
        // answer[0][1] = arr1[0][0] * arr2[0][1] + arr1[0][1] * arr2[1][1]
        // arr1의 i행과 arr2의 j열의 곱
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                int num = 0;
                int[] ints = arr1[i];
                for (int k = 0; k < ints.length; k++) {
                    num += ints[k] * arr2[k][j];
                }
                answer[i][j] = num;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] solution = solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}});
        System.out.println("art = " + Arrays.toString(solution[0]));
    }
}

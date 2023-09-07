package programers.lv2;

public class LandGame {

    static int solution(int[][] land) {
        // 4열 n행의 배열 -> 같은 열로는 이동 불가
        // 이 문제는 DynamicPrograming (동적계획법)의 memoization을 사용하여 캐시개념을 통해
        // 최적의 값들을 계속 저장하면서 풀어야함

        for (int i = 1; i < land.length; i++) {
            land[i][0] += max(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
            land[i][1] += max(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
            land[i][2] += max(land[i - 1][0], land[i - 1][1], land[i - 1][3]);
            land[i][3] += max(land[i - 1][0], land[i - 1][1], land[i - 1][2]);
        }

        return max(land[land.length - 1][0], land[land.length - 1][1],
            land[land.length - 1][2], land[land.length - 1][3]);
    }

    public static int max(int ... nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int solution = solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}});
        System.out.println("solution = " + solution);
    }
}

package programers.lv2;

public class LandGame {

    static int solution(int[][] land) {
        // 4열 n행의 배열 -> 같은 열로는 이동 불가
        int answer = 0;

        for (int i = 0; i < land.length; i++) {
            int max = 0;
            int lastIdx = 0;
            for (int j = 0; j < land[i].length; j++) {
                int num = land[i][j];
                if (num > max) {
                    max = num;
                    lastIdx = j;
                }
            }
            answer += land[i][lastIdx];
            if (i + 1 < land.length) {
                land[i + 1][lastIdx] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}});
        System.out.println("solution = " + solution);
    }

}

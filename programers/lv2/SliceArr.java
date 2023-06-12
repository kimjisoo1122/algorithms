package programers.lv2;


import java.util.Arrays;

public class SliceArr {
    public static int[] solution(int n, long left, long right) {

        int[] answer = new int[(int) (right - left) + 1];
        for (int i = 0; i < answer.length; i++) {
            // 행 구하기
            double temp = (left + 1) / (double) n;
            long row;
            if (temp % 1 != 0) {
                row = (long) Math.ceil(temp);
            } else {
                row = (long) temp;
             }
            // 행의 맨 첫 숫자 구하기
            long firstCol = ((row - 1) * n) + 1;
            // 주어진 숫자가 행의 몇번째 인지
            long idx = (left + 1) - firstCol + 1;
            // 로우보다 크면 인덱스 입력
            answer[i] = (int) Math.max(idx, row);
            left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(4, 7, 14);
        System.out.println("art = " + Arrays.toString(solution));
    }
}

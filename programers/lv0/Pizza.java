package programers.lv0;

import java.util.stream.IntStream;

public class Pizza {
    public static  int solution(int n) {

        int count = (int) IntStream.rangeClosed(4, n).filter(i -> {
                    int cnt = 0;
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            cnt++;
                        }
                    }
                    return cnt >= 3;
                })
                .count();

        int result = 0;
        for (int i = 4; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int solution = solution(15);
        System.out.println("solution = " + solution);
    }
}

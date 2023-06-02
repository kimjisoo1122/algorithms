package programers.lv2;

import java.util.Arrays;

public class Jump2 {
    public static long solution(int n) {

        if (n == 1) return (long) 1 % 1234567;

        int minLen = Math.max(Math.round(n / 2), 2);
        int numLen = n;
        int answer = 1;
        int twoCnt = 0;
        while (true) {
            numLen--;
            twoCnt++;
            if (numLen == minLen) {
                answer += n % 2 == 0 ? 1 : numLen;
                break;
            } else {
                int temp = numLen;
                for (int i = numLen - 1; i > numLen - twoCnt; i--) {
                    temp *= i;
                }
                long factorial = factorial(twoCnt);
                answer += temp / factorial;
            }
        }
        return (long) answer % 1234567;
    }
    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        long solution = solution(16);
        System.out.println("solution = " + solution);
        /**
         * 경우의수 구하는 공식
         * 15개의 숫자중 3개를 구하는 공식
         * C(15,3) = 15! / (3! (15 - 3)!)
         * 15 -3의 팩토리얼 값으로 분자에 12팩토리얼 까지 생략가능  어차피 1로 나뉘어짐
         * 15 * 14 * 13 / 3 * 2 * 1 = 경우의 수 455
         **/
    }
}

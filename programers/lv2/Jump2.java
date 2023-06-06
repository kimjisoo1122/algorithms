package programers.lv2;

public class Jump2 {
    public static long solution(int n) {

        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        return arr[n];
    }
    public static void main(String[] args) {
        long solution = solution(4);
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

package programers.lv2;

public class KakaoNumGame {

    public static String solution(int n, int t, int m, int p) {
        // n 진수, t 미리 구할 숫자(튜브가 대답할 갯수), m 참가인원, p 튜브순서

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t * m; i++) {
            String s = Integer.toString(i, n);
            sb.append(s.toUpperCase());
        }

        StringBuilder result = new StringBuilder();
        for (int i = p; i < sb.length();) {
            result.append(sb.charAt(i - 1));
            i += m;
        }

        return result.substring(0, t);
    }

    public static void main(String[] args) {
        String solution = solution(16, 16, 2, 1);
        System.out.println("solution = " + solution);
    }
}

package programers.lv0.java;

public class MathPow {
    public static int solution(int n, int t) {
        int result = n;
        for (int i = 0; i < t; i++) {
            result *= 2;
        }
        return n * (int) Math.pow(2, t);
    }

    public static void main(String[] args) {
        int solution = solution(7, 15);
        System.out.println("solution = " + solution);
    }
}

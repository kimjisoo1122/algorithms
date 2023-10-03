package programers.lv0.java;

public class MathSqrt {
    public static int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

    public static void main(String[] args) {
        int solution = solution(144);
        System.out.println("solution = " + solution);
    }
}

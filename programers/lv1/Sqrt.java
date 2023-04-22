package programers.lv1;

public class Sqrt {
    public static long solution(long n) {
        return Math.sqrt(n) % 1 == 0 ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }

    public static void main(String[] args) {
        long solution = solution(3);
        System.out.println("solution = " + solution);
    }
}

package programers.lv2;

public class Tournament {
    public static int solution(int n, int a, int b) {

        int round = 1;
        while (Math.abs(a - b) != 1 || Math.max(a, b) % 2 != 0) {
            a = (int) Math.round((double) a / 2);
            b = (int) Math.round((double) b / 2);
            round++;
        }
        return round;
    }

    public static void main(String[] args) {
        int solution = solution(128, 1, 60);
        // 2 , 4
        System.out.println("solution = " + solution);
    }
}

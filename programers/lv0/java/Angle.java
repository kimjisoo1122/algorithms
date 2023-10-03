package programers.lv0.java;

public class Angle {
    public static int solution(int angle) {
        double v = angle / 45.0;
        if (v % 1== 0) return (int) v;
        return angle > 90 ? 3 : 1;
    }

    public static void main(String[] args) {
        int solution = solution(91);
        System.out.println(0.0 == 0);

    }
}

package programers.lv1;

public class Paint {
    public static int solution(int n, int m, int[] section) {
        int cnt = 1;
        int painted = Math.min((section[0] + m) - 1, n);
        for (int i : section) {
            if (i > painted) {
                cnt++;
                painted = Math.min((i + m) - 1, n);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution(8, 4, new int[]{2,3,6});
        System.out.println("solution = " + solution);
    }
}

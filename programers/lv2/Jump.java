package programers.lv2;

public class Jump {
    public static int solution(int n) {

        System.out.println("Integer.bitCount(500) = " + Integer.bitCount(5000));
        int ans = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int solution = solution(5);
        System.out.println("solution = " + solution);
    }
}

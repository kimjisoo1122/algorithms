package programers.lv2;

public class BitCount {
    public static int solution(int n) {
        int oneCnt = Integer.bitCount(n);
        int cnt = 0;
        while (oneCnt != cnt) {
            n++;
            cnt = Integer.bitCount(n);
        }
        return n;
    }

    public static void main(String[] args) {
        int solution = solution(78);
        System.out.println("solution = " + solution);
    }
}

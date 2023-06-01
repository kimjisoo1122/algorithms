package programers.lv2;

public class Tournament {
    public static int solution(int n, int a, int b) {

        int maxRound = 0;
        int num = n;
        while (num > 1) {
            num  = num / 2;
            maxRound++;
        }
        while (true) {
            if (Math.abs(a - b) == 1) {
                break;
            }

            n /= 2;
            if (!((n >= a && n >= b) || (n < a && n < b))) {
                return maxRound;
            } else {
                maxRound--;
            }
            a = (int) Math.round((double) a / 2);
            b = (int) Math.round((double) b / 2);
        }
        return maxRound;
    }

    public static void main(String[] args) {
        int solution = solution(8, 1, 3);
        // 2 , 4
        System.out.println("solution = " + solution);
    }
}

package programers.lv1;

public class ThreeBrother {
    public int solution(int[] number) {

        int count = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int solution = new ThreeBrother().solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println("solution = " + solution);
    }
}

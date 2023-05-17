package programers.lv1;

public class MakeSosu {
    public static int solution(int[] nums) {

        System.out.println("Math.sqrt(7) = " + Math.sqrt(7));

        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (num >= 1) {
                        // 약수구하는 공식
                        // 숫자의 제곱근 같은수를 곱해서 나오는 숫자
                        // 제곱근을 2부터 해당수까지 나눠서 나눠지면 약수가 아님
                        boolean isPrime = true;
                        for (int l = 2; l <= Math.sqrt(num); l++) {
                            if (num % l == 0) {
                                isPrime = false;
                            }
                        }
                        if (isPrime) answer++;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int solution = solution(new int[]{1,2,7,6,4});
        System.out.println("solution = " + solution);
    }
}

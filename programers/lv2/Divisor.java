package programers.lv2;

public class Divisor {
    public static int solution(int n) {

        // 약수 갯수 구하는 공식
//        int cnt = 0;
////        for (int i = 1; i <= Math.sqrt(n); i++) {
////            if (n % i == 0) {
////                cnt += 2;
////                if (i * i == n) {
////                    cnt -= 1;
////                }
////            }
//        }

        // 약수 구하는 공식
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//                if (i * i != n) {
//                    System.out.println(n / i);
//                }
//            }
//        }

        // 주어진수의 약수중에 홀수의 갯수
//        int cnt = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                if (i % 2 != 0) {
//                    cnt++;
//                }
//                if (i * i != n) {
//                    if (i % 2 != 0) {
//                        cnt++;
//                    }
//                }
//            }
//        }


        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    cnt++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }

        }

        return cnt;
    }

    public static void main(String[] args) {
        int solution = solution(15);
        System.out.println("solution = " + solution);
    }
}

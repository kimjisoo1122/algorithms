package programers.lv2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public int solution(int n, int k) {
        String s = Integer.toString(n, k);
        if (!s.contains("0")) {
            return isPrime(Long.parseLong(s)) ? 1 : 0;
        }

        String[] split = s.split("");
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String value : split) {
            if (value.equals("0")) {
                if (sb.toString().equals("0")) {
                    continue;
                }
                sb.append("0");
                list.add(sb.toString());
                sb = new StringBuilder();
                sb.append("0");
            } else {
                sb.append(value);
            }
        }

        list.add(sb.toString());

        int answer = 0;
        for (String s1 : list) {
            if (s1.matches("0\\d0")
                    || s1.matches("\\d+0")
                    || s1.matches("0\\d+")) {
                String replace = s1.replace("0", "");
                if (!replace.isEmpty() && isPrime(Long.parseLong(replace))) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int solution = solution(110011, 10);
//        System.out.println("solution = " + solution);
    }
}

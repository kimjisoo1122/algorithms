package programers.lv0.java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CtrlZ {
    public int[] solution(int n) {

        Set<Integer> set = new LinkedHashSet<>();
        int divisor = 2;
        while (n > 1) {
            if (n % divisor == 0) {
                set.add(divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        CtrlZ ctrlZ = new CtrlZ();
        int[] solution = ctrlZ.solution(12);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
}

package programers.lv1;

import java.util.Arrays;

public class Avg {

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}

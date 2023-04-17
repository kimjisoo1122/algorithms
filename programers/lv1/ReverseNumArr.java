package programers.lv1;

import java.util.Arrays;

public class ReverseNumArr {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}

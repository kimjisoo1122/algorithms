package programers.lv0.java;

public class ThreeSixNine {
    public static int solution(int order) {
        return (int) String.valueOf(order).chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .filter(i -> i != 0 && i % 3 == 0)
                .count();
    }

    public static void main(String[] args) {
        int solution = solution(3);
        System.out.println("solution = " + solution);
    }
}

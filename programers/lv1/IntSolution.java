package programers.lv1;

public class IntSolution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return Integer.parseInt(reverse, 3);
    }

    public static void main(String[] args) {
        IntSolution intSolution = new IntSolution();
        int solution = intSolution.solution(125);
        System.out.println("solution = " + solution);
    }
}

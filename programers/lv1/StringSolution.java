package programers.lv1;

public class StringSolution {
    public int solution(String t, String p) {
        int result = 0;
        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            String substring = t.substring(i, i + p.length());
            if (substring.compareTo(p) <= 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringSolution stringSolution = new StringSolution();
        int solution = stringSolution.solution("3141592525", "271233");
        System.out.println("solution = " + solution);
    }
}

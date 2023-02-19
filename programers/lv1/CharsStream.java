package programers.lv1;

public class CharsStream {
    static boolean solution(String s) {
        return s.chars().filter(e -> e == 'p').count() == s.chars().filter(e -> e == 'y').count();

    }

    public static void main(String[] args) {
        boolean pPoooyY = solution("pPoooyY");
        System.out.println("pPoooyY = " + pPoooyY);
    }
}

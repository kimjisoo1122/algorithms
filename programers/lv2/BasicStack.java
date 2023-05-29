package programers.lv2;

public class BasicStack {
    static boolean solution(String s) {
        int num = 0;
        for (char c : s.toCharArray()) {
            num += c == '(' ? 1 : -1;
            if (num < 0) return false;
        }
        return num == 0;
    }

    public static void main(String[] args) {
        boolean solution = solution("()()");
        System.out.println("solution = " + solution);
    }
}

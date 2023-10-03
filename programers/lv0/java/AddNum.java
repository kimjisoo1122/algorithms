package programers.lv0.java;

public class AddNum {
    public static int solution(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int answer = 0;
        for (char aChar : chars) {
            answer += Integer.parseInt(String.valueOf(aChar));
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(1234);
        System.out.println("solution = " + solution);
    }
}

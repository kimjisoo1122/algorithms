package programers;

public class CutPaper {
    public static int solution(int M, int N) {
        return (M - 1) + ((N - 1) * M);
    }

    public static void main(String[] args) {
        int solution = solution(1, 1);
        System.out.println("solution = " + solution);

    }
}

package programers.lv1;

public class Cola {
    public static int solution(int a, int b, int n) {
        int cola = 0;
        while (n >= a) {
            int getCola = (n / a) * b;
            cola += getCola;
            n = getCola + (n % a);
        }
        return cola;
    }

    public static void main(String[] args) {
        int solution = solution(3, 1, 20);
        System.out.println("solution = " + solution);
    }
}

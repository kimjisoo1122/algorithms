import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Study {
    static void med3(int n) {
        for (int i = 4, j = 1; i > 0; i--,j++) {
            System.out.print(" ".repeat(i));
            System.out.println(String.valueOf(j).repeat(j + (j - 1)));

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String[] arr = new String[]{"A", "B", "C", "D", "E", "F"};
        StringBuilder sb = new StringBuilder();
        while (input > 0) {
            int i = input % 16;
            if (i > 10) {
                sb.insert(0, arr[i - 10]);
            } else {
                sb.insert(0, i);
            }
            input /= 16;
        }
        System.out.println("sb.toString() = " + sb.toString());

    }
}

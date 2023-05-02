package programers.lv1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        IntStream.rangeClosed(1, b).forEach(i -> {
            System.out.println("*".repeat(a));
        });
    }
}

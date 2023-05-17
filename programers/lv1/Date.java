package programers.lv1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date {
    public static String solution(int a, int b) {

        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString().substring(0,3);
    }

    public static void main(String[] args) {
        String solution = solution(5, 24);
        System.out.println("solution = " + solution);
    }
}

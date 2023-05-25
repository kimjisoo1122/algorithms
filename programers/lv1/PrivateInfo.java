package programers.lv1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PrivateInfo {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termsMap = Arrays.stream(terms)
                .map(s -> s.split(" "))
                .collect(Collectors.toMap(arr -> arr[0], arr2 -> Integer.parseInt(arr2[1])));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacySplit = privacies[i].split(" ");
            String date = privacySplit[0];
            String term = privacySplit[1];

            Integer termMonth = termsMap.get(term);
            String[] split = date.split("[.]");
            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2]);

            day = day - 1;
            if (day == 0) {
                month -= 1;
                day = 28;
            }
            month += termMonth;
            while (month > 12) {
                year += 1;
                month -= 12;
            }
            LocalDate expireDate = LocalDate.of(year, month, day);
            LocalDate parseToday = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            if (expireDate.isBefore(parseToday)) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"},
                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

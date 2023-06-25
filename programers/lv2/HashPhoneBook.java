package programers.lv2;


import java.util.*;

public class HashPhoneBook {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, Comparator.comparing(String::length));
        int minLen = phone_book[0].length();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : phone_book) {
            String firstWord = s.substring(0, minLen);
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            Optional.ofNullable(map.putIfAbsent(firstWord, list))
                    .ifPresent(e -> {
                        e.add(s);
                    });
            List<String> ifAbsent = map.putIfAbsent(firstWord, list);
            if (ifAbsent != null) {
                ifAbsent.add(s);
                map.put(firstWord, ifAbsent);
            }
        }

        for (List<String> value : map.values()) {
            if (value.size() < 2) {
                continue;
            }
            for (String s : value) {
                boolean result = value.stream()
                        .anyMatch(e -> !e.equals(s) && e.startsWith(s));
                if (result) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean solution = solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println("solution = " + solution);
        String substring = "12".substring(0, 2);
        System.out.println(substring);


    }
}

package programers.lv1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Babbling {
    public static int solution(String[] babbling) {
        List<String> list = new ArrayList<>();
        list.add("aya");
        list.add("ye");
        list.add("woo");
        list.add("ma");

        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                String temp = babbling[i];
                String regex = list.get(j);
                babbling[i] = temp.replaceFirst(regex, String.valueOf(j));
                if (!temp.equals(babbling[i])) {
                    if (babbling[i].contains(j + list.get(j))) {
                        continue;
                    }
                    list.add(list.get(j));
                }
            }
            HashSet<String> set = new HashSet<>(list);
            list = new ArrayList<>(set);
            if (babbling[i].replaceAll("[\\d]", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
        System.out.println("solution = " + solution);

    }

}

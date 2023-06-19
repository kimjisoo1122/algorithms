package programers.lv2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KakaoNews {
    public static int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        List<String> strList1 = new ArrayList<>();
        List<String> strList2 = new ArrayList<>();

        ArrayDeque<String> deque = new ArrayDeque<>();
        Pattern pattern = Pattern.compile("[^A-Z]");

        for (String s : str1.split("")) {
            deque.add(s);
            if (deque.size() == 2) {
                String firstWord = deque.pollFirst();
                String secondWord = deque.pollLast();
                String word = firstWord + secondWord;
                Matcher matcher = pattern.matcher(word);
                if (!matcher.find()) {
                    strList1.add(word);
                }
                deque.add(secondWord);
            }
        }
        deque.clear();
        for (String s : str2.split("")) {
            deque.add(s);
            if (deque.size() == 2) {
                String firstWord = deque.pollFirst();
                String secondWord = deque.pollLast();
                String word = firstWord + secondWord;
                Matcher matcher = pattern.matcher(word);
                if (!matcher.find()) {
                    strList2.add(word);
                }
                deque.add(secondWord);
            }
        }

        int intersection = 0;
        int union = Math.min(strList1.size(), strList2.size());
        if (strList1.size() >= strList2.size()) {
            for (String s : strList1) {
                int idx = strList2.indexOf(s);
                if (idx >= 0) {
                    strList2.remove(idx);
                    intersection++;
                }
            }
            union += strList1.size() - intersection;
        } else {
            for (String s : strList2) {
                int idx = strList1.indexOf(s);
                if (idx >= 0) {
                    strList1.remove(idx);
                    intersection++;
                }
            }
            union += strList2.size() - intersection;
        }
        return intersection == union ? 65536 : (int) Math.floor(( intersection /(double) union) * 65536);
    }

    public static void main(String[] args) {
        int solution = solution("E=M*C^2", "e=m*c^2");
        System.out.println("solution = " + solution);
    }
}

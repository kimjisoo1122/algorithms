package programers.lv1;

import java.util.ArrayList;
import java.util.List;

public class SpliStr {
    public static int solution(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        String compare = "";
        for (String str : s.split("")) {
            if (sb.length() == 0) {
                sb.append(str);
                compare = str;
                cnt = 1;
                continue;
            }

            sb.append(str);
            if (compare.equals(str)) {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        return list.size();
    }

    public static void main(String[] args) {
        int banana = solution("banana");
        System.out.println("banana = " + banana);
        int cnt = 0;
    }
}

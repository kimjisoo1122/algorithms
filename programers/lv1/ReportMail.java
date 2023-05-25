package programers.lv1;

import java.util.*;
import java.util.stream.Collectors;

public class ReportMail {
    public static int[] solution(String[] id_list, String[] report, int k) {

        LinkedHashMap<String, Integer> idMap = new LinkedHashMap<>();
        for (String s : id_list) {
            idMap.put(s, 0);
        }
        LinkedHashMap<String, Integer> reportMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> complainMap = new LinkedHashMap<>();

        List<String> reportList = Arrays.stream(report).distinct().collect(Collectors.toList());
        for (String rep : reportList) {
            String[] split = rep.split(" ");
            String complainer = split[0];
            String reporter = split[1];
            Integer reportAbsent = reportMap.putIfAbsent(reporter, 1);
            if (reportAbsent != null) {
                reportMap.put(reporter, reportAbsent + 1);
            }
            ArrayList<String> list = new ArrayList<>();
            list.add(complainer);
            List<String> complainAbsent = complainMap.putIfAbsent(reporter, list);
            if (complainAbsent != null) {
                complainAbsent.add(complainer);
                complainMap.put(reporter, complainAbsent);
            }
        }

        for (Map.Entry<String, Integer> singoEntry : reportMap.entrySet()) {
            if (k <= singoEntry.getValue()) {
                complainMap.get(singoEntry.getKey())
                        .forEach(jebo -> idMap.computeIfPresent(jebo, (key, value) -> value + 1));
            }
        }
        return idMap.values().stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
        System.out.println("art = " + Arrays.toString(solution));
    }
}

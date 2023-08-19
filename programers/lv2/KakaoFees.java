package programers.lv2;

import java.util.*;
import java.util.stream.Collectors;

public class KakaoFees {

    public static int[] solution(int[] fees, String[] records) {
        Map<String, List<String>> collectMap = Arrays.stream(records)
                .collect(Collectors.groupingBy(s -> s.substring(6, 10), TreeMap::new, Collectors.toList()));

        List<Integer> totalFees = new ArrayList<>();

        collectMap.forEach((k, v) -> {
            String lastValue = v.get(v.size() - 1);

            if (lastValue.substring(11).equals("IN")) {
                v.add(String.format("23:59 %s OUT", k));
            }

            int inTime = 0;
            int totalTime = 0;

            for (String s : v) {
                String inOut = s.substring(11);
                String[] splitTimes = s.substring(0, 5).split(":");
                int parseMinute = Integer.parseInt(splitTimes[0]) * 60 + Integer.parseInt(splitTimes[1]);

                if (inOut.equals("IN")) {
                    inTime = parseMinute;
                } else {
                    totalTime += parseMinute - inTime;
                }
            }

            if (fees[0] >= totalTime) {
                totalFees.add(fees[1]);
            } else {
                int feeTime = totalTime - fees[0];
                int totalFee = (int) Math.ceil((double) feeTime / fees[2]) * fees[3];
                totalFees.add(fees[1] + totalFee);
            }

        });

        return totalFees.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        // 0 기본시간, 1 기본요금, 2 부과시간기준, 3 부과시간당 가격
        int[] solution = solution(new int[]{120, 0, 60, 591},
                new String[]{"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"});
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
}

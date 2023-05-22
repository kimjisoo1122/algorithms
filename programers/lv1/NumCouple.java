package programers.lv1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NumCouple {
    public static String solution(String X, String Y) {
        Map<Character, Integer> mapX = new TreeMap<>(Comparator.reverseOrder());
        Map<Character, Integer> mapY = new HashMap<>();

        // X의 각 숫자의 개수를 저장
        for (char c : X.toCharArray()) {
            mapX.put(c, mapX.getOrDefault(c, 0) + 1);
        }

        // Y의 각 숫자의 개수를 저장
        for (char c : Y.toCharArray()) {
            mapY.put(c, mapY.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        boolean hasPair = false;

        // X와 Y의 공통된 숫자 중 짝지을 수 있는 숫자를 찾아서 StringBuilder에 추가
        for (char c : mapX.keySet()) {
            if (mapY.containsKey(c)) {
                int countX = mapX.get(c);
                int countY = mapY.get(c);
                int pairCount = Math.min(countX, countY);

                for (int i = 0; i < pairCount; i++) {
                    sb.append(c);
                    hasPair = true;
                }
            }
        }
        if (!hasPair) {
            return "-1"; // 짝꿍이 없는 경우
        }
        String answer = sb.toString();

        return answer.replace("0", "").isEmpty() ? "0" : answer;
    }

    public static void main(String[] args) {
        String solution = solution("5525", "1255");
        System.out.println("solution = " + solution);

    }
}

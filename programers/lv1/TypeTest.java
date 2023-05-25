package programers.lv1;

import java.util.HashMap;

public class TypeTest {
    public static String solution(String[] survey, int[] choices) {
        int[] score = new int[]{0, 3, 2, 1, 0, 1, 2, 3};
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            String firstType = String.valueOf(survey[i].charAt(0));
            String secondType = String.valueOf(survey[i].charAt(1));

            if (choices[i] == 4) continue;
            String type = choices[i] < 4 ? firstType : secondType;
            Integer ifAbsent = map.putIfAbsent(type, score[choices[i]]);
            if (ifAbsent != null) {
                map.put(type, ifAbsent + score[choices[i]]);
            }
        }

        StringBuilder sb = new StringBuilder();
        String[][] types = new String[][]{{"R","T"},{"C","F"},{"J","M"},{"A","N"}};
        for (String[] type : types) {
            int firstType = map.getOrDefault(type[0], 0);
            int secondType = map.getOrDefault(type[1], 0);

            if (firstType >= secondType) {
                sb.append(type[0]);
            } else {
                sb.append(type[1]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String solution = solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        System.out.println("solution = " + solution);
    }
}

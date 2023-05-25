package programers.lv1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WallPaper {
    public static int[] solution(String[] wallpaper) {

        LinkedHashMap<Integer, Integer[]> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < wallpaper.length; i++) {
            int startIdx = wallpaper[i].indexOf("#");
            int lastIdx = wallpaper[i].lastIndexOf("#");
            if (startIdx == -1) continue;
            linkedHashMap.put(i, new Integer[]{startIdx, lastIdx});
        }
        int[] answer = new int[4];
        answer[0] = Integer.MAX_VALUE;
        answer[1] = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer[]> entry : linkedHashMap.entrySet()) {
            answer[0] = Math.min(answer[0], entry.getKey());
            answer[1] = Math.min(answer[1], entry.getValue()[0]);
            answer[2] = Math.max(answer[2], entry.getKey() + 1);
            answer[3] = Math.max(answer[3], entry.getValue()[1] + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new String[]{".#...", "..#..", "...#."});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

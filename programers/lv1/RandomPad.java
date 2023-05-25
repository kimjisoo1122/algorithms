package programers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RandomPad {
    public static int[] solution(String[] keymap, String[] targets) {

        Map<String, Integer> map = new HashMap<>();

        for (String targetStr : targets) {
            String[] targetSplit = targetStr.split("");
            for (String target : targetSplit) {
                for (String key : keymap) {
                    int targetIdx = key.indexOf(target);
                    if (targetIdx == -1) continue;
                    Integer ifAbsent = map.putIfAbsent(target, targetIdx);
                    if (ifAbsent != null) {
                        map.put(target, Math.min(ifAbsent, targetIdx));
                    }
                }
            }
        }
        int[] answer = new int[targets.length];
        for (int i = 0; i < answer.length; i++) {
            String[] targetSplit = targets[i].split("");
            int sum = 0;
            for (String target : targetSplit) {
                Integer touchCnt = map.getOrDefault(target, -1);
                if (touchCnt == -1) {
                    answer[i] = -1;
                    break;
                }
                sum += touchCnt + 1;
            }
            answer[i] = answer[i] == -1 ? -1 : sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"AA"}, new String[]{"B"});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

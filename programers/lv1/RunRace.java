package programers.lv1;

import java.util.Arrays;
import java.util.HashMap;

public class RunRace {
    public static String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
        }
        for (String calling : callings) {
            Integer idx = hashMap.get(calling);
            if (idx == 0) continue;
            hashMap.put(calling, idx - 1);
            hashMap.computeIfPresent(players[idx - 1], (k, v) -> v + 1);
            String temp = players[idx - 1];
            players[idx - 1] = calling;
            players[idx] = temp;
        }
        return players;
    }

    public static void main(String[] args) {
        String[] solution = solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});
        System.out.println("art = " + Arrays.toString(solution));

    }
}

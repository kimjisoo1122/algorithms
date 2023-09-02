package programers.lv2;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Heap {
    public static int solution(int[] scoville, int K) {
        TreeMap<Integer, Long> treeMap = Arrays.stream(scoville)
            .filter(i -> i < K)
            .sorted()
            .boxed()
            .collect(Collectors.groupingBy(i -> i, TreeMap::new, Collectors.counting()));

        if (treeMap.isEmpty()) {
            return 0;
        }

        if (treeMap.size() < scoville.length) {
            treeMap.put(K, 1L);
        }

        int cnt = 0;
        while (treeMap.size() >= 2) {
            Integer firstPoll;
            Integer secondPoll;

            Entry<Integer, Long> firstEntry = treeMap.pollFirstEntry();
            firstPoll = firstEntry.getKey();
            Long firstCnt = firstEntry.getValue();

            if (firstPoll >= K) {
                return cnt;
            }

            if (firstCnt > 1) {
                secondPoll = firstPoll;

                if (firstCnt > 2) {
                    treeMap.put(secondPoll, firstEntry.getValue() - 2);
                }

            } else {
                Entry<Integer, Long> secondEntry = treeMap.pollFirstEntry();
                secondPoll = secondEntry.getKey();

                if (secondEntry.getValue() > 1) {
                    treeMap.put(secondPoll, secondEntry.getValue() - 1);
                }
            }

            Integer addScovile = firstPoll + (secondPoll * 2);
            treeMap.compute(addScovile, (k, v) -> v == null ? 1 : v + 1);

            cnt++;
        }

        return treeMap.firstKey() >= K ? cnt : -1;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println("solution = " + solution);
    }
}

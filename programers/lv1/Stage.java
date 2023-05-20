package programers.lv1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stage {
    public static int[] solution(int N, int[] stages) {
        int challenger = stages.length;
        Map<Integer, List<Integer>> map = Arrays.stream(stages)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .filter(i -> i <= N)
                .collect(Collectors.groupingBy(i -> i));

        LinkedHashMap<Double, List<Integer>> linkedHashMap = new LinkedHashMap<>();
        TreeSet<Double> treeSet = new TreeSet<>(Comparator.reverseOrder());

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            double failure = (double) entry.getValue().size() / challenger;
            challenger -= entry.getValue().size();
            List<Integer> idx = new ArrayList<>();
            idx.add(entry.getKey());
            List<Integer> ifAbsent = linkedHashMap.putIfAbsent(failure, idx);
            if (ifAbsent != null) {
                ifAbsent.addAll(idx);
                linkedHashMap.put(failure, ifAbsent);
            }
            treeSet.add(failure);
        }
        LinkedHashSet<Integer> linkedHashSet = treeSet.stream()
                .map(linkedHashMap::get)
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        linkedHashSet.addAll(IntStream.rangeClosed(1, N).boxed().collect(Collectors.toList()));

        return linkedHashSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(4, new int[]{4, 4, 4, 4, 4});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

package programers.lv2;

import java.util.LinkedHashSet;

public class Cache {
    public static int solution(int cacheSize, String[] cities) {
        // LRU(Least Recently Used)캐시 알고리즘
        // 최근에 사용한 캐시를 맨 앞으로 이동 가장 오랫동안 사용하지 않은 캐시 교체
        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String city : cities) {
            city = city.toUpperCase();
            if (set.contains(city)) {
                set.remove(city);
                set.add(city);
                answer += 1;
            } else {
                if (set.size() == cacheSize) {
                    for (String s : set) {
                        set.remove(s);
                        break;
                    }
                }
                set.add(city);
                answer += 5;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution(3,
                new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
        System.out.println("solution = " + solution);
    }
}

package programers.lv2;

import java.util.*;
import java.util.stream.Collectors;

public class KakaoCompression {
    public static int[] solution(String msg) {
        Map<String, Integer> idxDictionary = new HashMap<>();
        for (int i = 'A', j = 1; i <= 'Z'; i++,j++) {
            idxDictionary.put(String.valueOf((char) i), j);
        }

        List<Integer> answer = new ArrayList<>();
        ArrayDeque<String> deque =
                Arrays.stream(msg.split("")).collect(Collectors.toCollection(ArrayDeque::new));


        StringBuilder sb = new StringBuilder();
        String prevInsertWord = "";
        while (!deque.isEmpty()) {
            String pop = deque.pop();
            prevInsertWord = sb.toString();
            sb.append(pop);
            String nowInsertWord = sb.toString();
            // 사전에서 검색한다.
            Integer findWord = idxDictionary.get(nowInsertWord);
            if (findWord == null) {
                // 이어붙힌 단어가 사전에 없으면 그 이전에 입력했던 값 출력리스트 추가
                Integer prevIdx = idxDictionary.get(prevInsertWord);
                answer.add(prevIdx);
                // 사전에 추가한다.
                idxDictionary.put(nowInsertWord, idxDictionary.size() + 1);
                // 출력한 단어는 제외하고 그 다음 단어는 다시 추가해준다.
                deque.addFirst(pop);
                // 이전 단어 초기화
                sb = new StringBuilder();
            } else {
                if (deque.size() == 0) {
                    answer.add(idxDictionary.get(nowInsertWord));
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] kakaos = solution("KAKAO");
        System.out.println("art = " + Arrays.toString(kakaos));

    }
}

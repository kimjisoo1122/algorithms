package programers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class KakaoOpenChat {

    public static String[] solution(String[] record) {

        BinaryOperator<String> stringFormat = (action, userId) -> {
            String message = "Enter".equals(action)
                ? "님이 들어왔습니다."
                : "님이 나갔습니다.";
            return userId + message;
        };

        Map<String, String> userIdMap = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for (String s : record) {
            String[] split = s.split(" ");
            String action = split[0];
            String userId = split[1];


            if (split.length > 2) {
                userIdMap.put(userId, split[2]);
            }

            if (!"Change".equals(action)) {
                answer.add(stringFormat.apply(action, userId));
            }
        }

        return answer.stream()
            .map(message -> {
                String userId = message.substring(0, message.indexOf("님"));
                return message.replace(userId, userIdMap.get(userId));
            }).toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] record = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
            "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        String[] solution = solution(record);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
}

package programers.lv2;

import java.util.ArrayList;
import java.util.List;

public class TotalDictionary {

    public  int solution(String word) {
        String[] wordArr = new String[]{"A", "E", "I", "O", "U"};
        List<String> list = new ArrayList<>();

        dfs("", 0, list, wordArr );

        return list.indexOf(word);
    }

    public void dfs(String word, int depth, List<String> list, String[] wordArr) {
        list.add(word);

        if(depth == 5) {
            return;
        }

        for (int i = 0; i < wordArr.length; i++) {
            dfs(word + wordArr[i],depth + 1, list, wordArr);
        }
    }

}



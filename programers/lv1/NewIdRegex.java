package programers.lv1;

public class NewIdRegex {
    public static String solution(String new_id) {
        // 1단계
        String newId = new_id.toLowerCase();
        // 2단계
        newId = newId.replaceAll("[^a-z._\\d-]", "");
        // 3단계
        newId = newId.replaceAll("[.]{2,}", ".");
        // 4단계
        newId = newId.replaceAll("^[.]|[.]$", "");
        // 5단계
        if (newId.isEmpty()) {
            newId = "a";
        }
        // 6단계
        if (newId.length() >= 16) {
            newId = newId.substring(0, 15);
            String lastWord = String.valueOf(newId.charAt(newId.length() - 1));
            if (lastWord.equals(".")) {
                newId = newId.replaceAll(".$", "");
            }

        }
       // 7단계
        if (newId.length() <= 2) {
            String lastWord = String.valueOf(newId.charAt(newId.length() - 1));
            newId = newId + lastWord.repeat(3 - newId.length());
        }
        return newId;
    }

    public static void main(String[] args) {
        String solution = solution("...!@BaT#*..y.abcdefghijklm.");
        System.out.println("solution = " + solution);
    }
}

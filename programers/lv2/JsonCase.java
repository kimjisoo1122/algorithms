package programers.lv2;

public class JsonCase {
    public static String solution(String s) {
        String lowerCase = s.toLowerCase();

        String[] arr = lowerCase.split("");
        arr[0] = arr[0].toUpperCase();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].isBlank()) {
                arr[i] = arr[i].toUpperCase();
            }
        }
        return String.join("", arr);
    }

    public static void main(String[] args) {
        String solution = solution("3people unFollowed me");
        System.out.println("solution = " + solution);
    }
}

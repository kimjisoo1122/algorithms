package programers.lv1;

public class ReplaceStrNum {
    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int one4seveneight = solution("23four5six7");
        System.out.println("one4seveneight = " + one4seveneight);
    }
}

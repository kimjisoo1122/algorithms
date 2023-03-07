package programers.lv0;

public class Decription {
    public static String solution(String cipher, int code) {
        StringBuilder temp = new StringBuilder();
        for (int i = code; i <= cipher.length(); i+=code) {
            temp.append(cipher.charAt(i - 1));
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        String solution = solution("dfjardstddetckdaccccdegk", 4);
        System.out.println("solution = " + solution);
    }
}

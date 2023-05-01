package programers.lv1;

public class PhoneNum {
    public static String solution(String phone_number) {
        String s = phone_number.replaceAll(".(?=.{4})", "*");
        String subStr = phone_number.substring(0, phone_number.length() - 4);
        return phone_number.replace(subStr, "*".repeat(subStr.length()));
    }

    public static void main(String[] args) {
        String solution = solution("01033334444");
        System.out.println("solution = " + solution);
    }
}

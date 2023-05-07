package programers.lv1;

public class StrangeWord {
    public String solution(String s) {
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (String str : arr) {
            if (flag) {
                sb.append(str.toUpperCase());
            } else {
                sb.append(str.toLowerCase());
            }
            flag = !flag;
            if (str.equals(" ")) {
                flag = true;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String solution = new StrangeWord().solution("try  hello world");
        System.out.println("solution = " + solution);
    }
}

package programers.lv0;

public class HateEng {
    public static long solution(String numbers) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine", "ten"};
        for (int i = 0; i < arr.length; i++) {
            numbers = numbers.replace(arr[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {

        long solution = solution("onefourzerosixseven");
        System.out.println("solution = " + solution);
    }
}

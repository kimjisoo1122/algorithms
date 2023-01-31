package programers;


import java.util.Arrays;

public class NextArr {
    public static int[] nextArr(int num, int total) {

        int[] result = new int[num];
        int middleNum = (int) total / num;
        int remainder = total % num;
        if (remainder == 0) {
            int cnt = (num - 1) / 2;
            int startNum = middleNum - cnt;
            for (int i = 0; i < num; i++) {
                result[i] = startNum++;
            }
        }
        else {
            int cnt = num - ((num / 2) + 1);
            int startNum = middleNum - cnt;
            for (int i = 0; i < num; i++) {
                result[i] = startNum++;
            }
        }
        return result;
    }




    public static void main(String[] args) {

        int[] ints1 = nextArr(4, 14);
        int[] ints2 = nextArr(5, 5);
        System.out.println("ints1 = " + Arrays.toString(ints1));
        System.out.println("ints2 = " + Arrays.toString(ints2));
    }
}

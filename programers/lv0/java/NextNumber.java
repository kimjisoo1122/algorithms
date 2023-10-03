package programers.lv0.java;

public class NextNumber {

    public static int solution(int[] common) {

        int lastIdxNum = common[common.length - 1];
        int lastPrevIdxNum = common[common.length - 2];
        int firstIdxNum = common[0];
        int secondIdxNum = common[1];

        // 등차수열
        if (lastIdxNum - lastPrevIdxNum == secondIdxNum - firstIdxNum) {
            return lastIdxNum += lastIdxNum - lastPrevIdxNum;
        }
        // 등비수열
        if (lastIdxNum / lastPrevIdxNum == secondIdxNum / firstIdxNum) {
            return lastIdxNum *= lastIdxNum / lastPrevIdxNum;
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] common = {6,54,486};
        int solution = solution(common);
        System.out.println("solution = " + solution);
    }
}

package programers.lv1;

import java.util.HashMap;

public class TouchKeypad {
    public static String solution(int[] numbers, String hand) {
        String[] fingers = new String[]{"#","L","#","R","L","#","R","L","#","R"};
        HashMap<Integer, Integer[]> padMap = new HashMap<>();
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                padMap.put(num++, new Integer[]{i, j});
            }
        }
        padMap.put(0, new Integer[]{3, 1});
        
        int currentLeftX = 0;
        int currentLeftY = 3;
        int currentRightX = 2;
        int currentRightY = 3;
        
        StringBuilder sb = new StringBuilder();

        for (int number : numbers) {
            String nowFinger = fingers[number];
            if (nowFinger.equals("L")) {
                currentLeftX = padMap.get(number)[1];
                currentLeftY = padMap.get(number)[0];
            } else if (nowFinger.equals("R")) {
                currentRightX = padMap.get(number)[1];
                currentRightY = padMap.get(number)[0];
            } else if (nowFinger.equals("#")) {
                int currentX = padMap.get(number)[1];
                int currentY = padMap.get(number)[0];

                int leftX = Math.abs(currentX - currentLeftX);
                int leftY = Math.abs(currentY - currentLeftY);
                int rightX = Math.abs(currentX - currentRightX);
                int rightY = Math.abs(currentY - currentRightY);

                int left = leftX + leftY;
                int right = rightX + rightY;
                
                if (left == right) {
                    if (hand.equals("right")) {
                        currentRightX = currentX;
                        currentRightY = currentY;
                        nowFinger = "R";
                    } else {
                        currentLeftX = currentX;
                        currentLeftY = currentY;
                        nowFinger = "L";
                    }
                } else if (left > right) {
                    currentRightX = currentX;
                    currentRightY = currentY;
                    nowFinger = "R";
                } else {
                    currentLeftX = currentX;
                    currentLeftY = currentY;
                    nowFinger = "L";
                }
            }
            sb.append(nowFinger);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String right = solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        System.out.println("right = " + right);
    }
}

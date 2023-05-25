package programers.lv1;

import java.util.Arrays;

public class WalkingPark {
    public static int[] solution(String[] park, String[] routes) {
        String[][] parkArr = new String[park.length][park[0].length()];
        int currentX = 0;
        int currentY = 0;
        for (int i = 0; i < parkArr.length; i++) {
            for (int j = 0; j < parkArr[i].length; j++) {
                String[] split = park[i].split("");
                parkArr[i][j] = split[j];
                if (split[j].equals("S")) {
                    currentY = i;
                    currentX = j;
                }
            }
        }

        for (String route : routes) {
            String[] split = route.split(" ");
            String direction = split[0];
            int range = Integer.parseInt(split[1]);
            String currentMap = "";

            routeFor:
            for (int i = 1; i <= range; i++) {
                switch (direction) {
                    case "E":
                        currentX += 1;
                        if (currentX >= parkArr[0].length) {
                            currentX -= i;
                            break routeFor;
                        }
                        currentMap = parkArr[currentY][currentX];
                        if (currentMap.equals("X")) {
                            currentX -= i;
                            break routeFor;
                        }
                        break;
                    case "S":
                        currentY += 1;
                        if (currentY >= parkArr.length) {
                            currentY -= i;
                            break routeFor;
                        }
                        currentMap = parkArr[currentY][currentX];
                        if (currentMap.equals("X")) {
                            currentY -= i;
                            break routeFor;
                        }
                        break;
                    case "W":
                        currentX -= 1;
                        if (currentX < 0) {
                            currentX += i;
                            break routeFor;
                        }
                        currentMap = parkArr[currentY][currentX];
                        if (currentMap.equals("X")) {
                            currentX += i;
                            break routeFor;
                        }
                        break;
                    case "N":
                        currentY -= 1;
                        if (currentY < 0) {
                            currentY += i;
                            break routeFor;
                        }
                        currentMap = parkArr[currentY][currentX];
                        if (currentMap.equals("X")) {
                            currentY += i;
                            break routeFor;
                        }
                        break;
                }
            }
        }
        int[] answer = {currentY, currentX};
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"});
        System.out.println("art = " + Arrays.toString(solution));
    }
}

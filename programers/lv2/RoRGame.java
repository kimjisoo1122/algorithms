package programers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class RoRGame {

    public static int solution(int[][] maps) {
        // dfs
        List<String> directions = new ArrayList<>();
        directions.add("E");
        directions.add("S");
        directions.add("W");
        directions.add("N");

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        dfs(1, 0, 0, maps, directions, priorityQueue);

        System.out.println("priorityQueue = " + priorityQueue);
        Integer poll = priorityQueue.poll();

        return poll == null ? -1 : poll;
    }

    public static void dfs(int score, int x, int y, int[][] maps, List<String> directions, PriorityQueue<Integer> priorityQueue) {
        if (x == maps.length - 1 && y == maps[x].length - 1) {
            priorityQueue.add(score);
            return;
        }

        int beforeX = x;
        int beforeY = y;


        for (String direction : directions) {
            switch (direction) {
                case "E":
                    y += 1;
                    break;
                case "S":
                    x += 1;
                    break;
                case "W":
                    y -= 1;
                    break;
                case "N":
                    x -= 1;
                    break;
            }

            try {
                int num = maps[x][y];
                if (num == 0) {
                    throw new IndexOutOfBoundsException();
                }

                directions = validateDirections(direction);
                dfs(score + 1, x, y, maps, directions, priorityQueue);
            } catch (IndexOutOfBoundsException e) {
                x = beforeX;
                y = beforeY;
            }
        }
    }

    public static List<String> validateDirections(String direction) {
        List<String> directions = new ArrayList<>();
        directions.add("E");
        directions.add("S");
        directions.add("N");
        directions.add("W");
        switch (direction) {
            case "E":
                directions = Arrays.asList("E", "S", "N");
                break;
            case "S":
                directions = Arrays.asList("E", "S", "W");
                break;
            case "W":
                directions = Arrays.asList("S", "W", "N");
                break;
            case "N":
                directions = Arrays.asList("E", "N", "W");
                break;
        }
        return directions;
    }

    public static void main(String[] args) {
        int solution = solution(
            new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}});
        System.out.println("solution = " + solution);
    }
}

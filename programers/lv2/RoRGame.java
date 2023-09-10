package programers.lv2;

public class RoRGame {

    public static int solution(int[][] maps) {
        // dfs
        String[] directions = {"W", "N", "E", "S"};

        return dfs(1, 0, 0, maps, directions);
    }

    public static int dfs(int score, int x, int y, int[][] maps, String[] directions) {
        if (x == maps.length - 1 && y == maps[x].length - 1) {
            return score;
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

                // 왔던 길 0 처리
                maps[beforeX][beforeY] = 0;

                dfs(score + 1, x, y, maps, directions);
            } catch (IndexOutOfBoundsException e) {
                x = beforeX;
                y = beforeY;
            }
        }
        return score;
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

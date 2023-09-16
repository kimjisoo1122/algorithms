package programers.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class RoRGame {
    int[][] visited;
    int[][] maps;
    int xLen;
    int yLen;
    int[] dx = {0, 0, 1, -1}; // 동 서 남 북
    int[] dy = {1, -1, 0, 0};

    public int solution(int[][] maps) {
        this.visited = new int[maps.length][maps[0].length];
        this.maps = maps;
        xLen = maps.length;
        yLen = maps[0].length;
        visited[0][0] = 1;

        bfs();
        return visited[xLen - 1][yLen - 1] == 0 ? - 1 :  visited[xLen - 1][yLen - 1];
    }

    public void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] poll = queue.remove();
            int currX = poll[0];
            int currY = poll[1];

            for (int i = 0; i < 4; i++) {
                int x = currX + dx[i];
                int y = currY + dy[i];
                if ((x >= xLen || x < 0) || (y >= yLen || y < 0)) {
                    continue;
                }

                if (visited[x][y] == 0 && maps[x][y] == 1) {
                    visited[x][y] = visited[currX][currY] + 1;
                    queue.add(new int[]{x, y});
                }
            }
        }
    }
}

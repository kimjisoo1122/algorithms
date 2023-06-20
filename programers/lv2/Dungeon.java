package programers.lv2;

public class Dungeon {
    static boolean[] visited;
    static int answer = 0;

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        return dfs(dungeons,k,visited,0);
    }

    private static int dfs(int[][] dungeons, int k, boolean[] visited, int count){
        for(int i = 0; i < dungeons.length; i++){
            if(k >= dungeons[i][0] && !visited[i]){
                visited[i] = true;
                dfs(dungeons,k - dungeons[i][1], visited, count + 1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, count);

        return answer;
    }
    public static void main(String[] args) {
        int solution = solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
        System.out.println("solution = " + solution);
    }
}

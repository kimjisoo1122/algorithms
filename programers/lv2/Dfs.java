package programers.lv2;

public class Dfs {

    int answer;
    int[] numbers;

    public int solution(int[] numbers, int target) {
        // depth first search 깊이 우선 탐색
        // 재귀 함수로 dfs를 구현할때의 순서
        /**
         * 1. 변하지 않는 것은 멤버 변수로 선언
         *     numbers와 target은 변하지 않는다.
         * 2. 수행동작
         *     인덱스를 하나씩 증가 시키고 해당 인덱스의 값을 더하거나 빼준다
         * 3. 탈출조건
         *     인덱스가 넘버의 길이랑 같아지고 이때 타켓과 값이 같으면 answer를 +해주고 리턴한다
         *  4, 1, 2, 1
         *  1까지 재귀함수로 모두 더해주고 탈출조건으로 그 전 노드로 탈출하고
         *  - 재귀함수를 실행한다
         */
        answer = 0;
        this.numbers = numbers;
        dfs(0, 0, this.numbers, target);
        return answer;
    }

    private void dfs(int idx, int sum, int[] numbers, int target) {
        // 2. 탈출 조건
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        // 1. 수행 동작
        dfs(idx + 1, sum + numbers[idx], numbers, target);
        dfs(idx + 1, sum - numbers[idx], numbers, target);
    }

    public static void main(String[] args) {

        int solution = new Dfs().solution(new int[]{4, 1, 2, 1}, 4);
        System.out.println("solution = " + solution);
    }
}

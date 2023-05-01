package programers.lv1;

public class IntSolution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr1[i].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        IntSolution intSolution = new IntSolution();
        int[][] solution = intSolution.solution(new int[][]{{1,2}, {3,4}}, new int[][]{{3,4},{5,6}});
        System.out.println("solution = " + solution);
    }
}

package programers.lv0;

public class Chicken {
    public int solution(int chicken) {

        return (chicken / 10) + (chicken / 10 / 10);
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        int solution = chicken.solution(100);
        System.out.println("solution = " + solution);
    }
}


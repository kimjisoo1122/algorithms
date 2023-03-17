package programers.lv0;

public class Chicken {
    public int solution(int chicken) {
        int service = 0;
        int coupon = 0;
        while (chicken / 10 == 0) {
            service += chicken / 10;
            System.out.println("service = " + service);
            chicken /= 10;
        }
        return (chicken / 10) + (chicken / 10 / 10);
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        int solution = chicken.solution(100);
        System.out.println("solution = " + solution);
    }
}


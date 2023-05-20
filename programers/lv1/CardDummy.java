package programers.lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CardDummy {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        LinkedList<String> cardLinkedList1 = Arrays.stream(cards1).collect(Collectors.toCollection(LinkedList::new));
        LinkedList<String> cardLinkedList2 = Arrays.stream(cards2).collect(Collectors.toCollection(LinkedList::new));
        LinkedList<String> goalLinkedList = Arrays.stream(goal).collect(Collectors.toCollection(LinkedList::new));
        int size = goalLinkedList.size();
        for (int i = 0; i < size; i++) {
            String word = goalLinkedList.pop();
            if (word.equals(cardLinkedList1.peek())) {
                cardLinkedList1.pop();
            } else if (word.equals(cardLinkedList2.peek())) {
                cardLinkedList2.pop();
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        String solution = solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println("solution = " + solution);
    }
}

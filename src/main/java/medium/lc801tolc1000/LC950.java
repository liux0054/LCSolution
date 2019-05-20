package medium.lc801tolc1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> order = new LinkedList<>();

        for(int i=0; i<deck.length; i++){
            order.add(i);
        }

        List<Integer> newOrder = new ArrayList<>();
        while(!order.isEmpty()){
            newOrder.add(order.poll());
            if(!order.isEmpty()){
                order.add(order.poll());
            }
        }

        Arrays.sort(deck);
        int[] answer = new int[deck.length];
        for(int i=0; i<deck.length; i++){
            answer[newOrder.get(i)] = deck[i];
        }
        return answer;
    }
}

package medium;

import java.util.HashSet;
import java.util.Set;

import common.ListNode;

public class LC817 {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> g = new HashSet<>();
        for(int gg:G){
            g.add(gg);
        }

        if(head.next == null || head.next.next == null){
            return 1;
        }

        int answer = 0;
        while(head.next.next != null){
            if(g.contains(head.val) && g.contains(head.next.val)){
                answer++;
            }
            head = head.next;
        }

        return ++answer;
    }
}

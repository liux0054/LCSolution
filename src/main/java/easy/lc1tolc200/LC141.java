package easy.lc1tolc200;

import java.util.HashSet;

import common.ListNode;

public class LC141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        while (head != null){
            if(visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }
}

package medium.lc1tolc200;

import common.ListNode;

public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        int order = getSize(head) - n;

        if(order == 0){
            return head.next;
        }

        ListNode current = head;
        while(order > 1){
            current = current.next;
            order--;
        }
        current.next = current.next.next;
        return head;
    }

    private int getSize(ListNode head){
        int size =  0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}

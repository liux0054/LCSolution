package easy.lc1tolc200;

import common.ListNode;

public class LC83 {
    public ListNode deleteDuplicates(ListNode head) {
       if(head == null) {
           return head;
       }
       ListNode current = head;
       ListNode next = current.next;
       while(next != null){
           while(next != null && current.val == next.val){
               next = next.next;
           }
           current.next = next;
           if(next != null){
               current = next;
               next = current.next;
           }
       }
       return head;
    }
}

package medium.lc1tolc200;

import common.ListNode;

public class LC86 {

    public ListNode partition(ListNode head, int x) {
        ListNode head1 = null;
        ListNode head2 = null;
        ListNode tail1 = null;
        ListNode tail2 = null;

        while(head != null){
            int val = head.val;
            if(val < x){
                ListNode newNode = new ListNode(val);
                if(head1 == null && tail1 == null) {
                    head1 = newNode;
                    tail1 = newNode;
                }
                else{
                    tail1.next = newNode;
                    tail1 = newNode;
                }
            }else{
                ListNode newNode = new ListNode(val);
                if(head2 == null && tail2 == null){
                    head2 = newNode;
                    tail2 = newNode;
                }else{
                    tail2.next = newNode;
                    tail2 = newNode;
                }
            }
            head = head.next;
        }
        if(head1 == null) return head2;
        if(head2 != null) tail1.next = head2;
        return head1;
    }
}

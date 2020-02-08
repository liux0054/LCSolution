package medium;

import common.ListNode;

public class LC92 {
    ListNode left;
    boolean stop = false;

    public ListNode reverseBetween(ListNode head, int m, int n) {
        left = head;
        reverse(head, m, n);
        return head;
    }

    public void reverse(ListNode right, int m, int n) {
       if(n == 0) {
           return;
       }

       if(m > 1) {
           left = left.next;
       }

       if (n > 1) {
           reverse(right.next, m-1, n-1);
       }

       if(left == right || right.next == left) {
           stop = true;
       }

       if(!stop) {
           int temp = right.val;
           right.val = left.val;
           left.val = temp;
           left = left.next;
       }
    }
}

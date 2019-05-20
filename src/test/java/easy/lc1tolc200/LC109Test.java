package easy.lc1tolc200;

import org.junit.Test;

import common.ListNode;
import easy.lc1tolc200.LC109;

public class LC109Test {

    @Test
    public void testCase1(){
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        new LC109().sortedListToBST(head);
    }
}

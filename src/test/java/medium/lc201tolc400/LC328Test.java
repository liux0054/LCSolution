package medium.lc201tolc400;


import org.junit.Test;

import common.ListNode;
import medium.LC328;

public class LC328Test {
    @Test
    public void testCase1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newHead =  new LC328().oddEvenList(head);
        System.out.println();
    }

    @Test
    public void testCase2(){
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode newHead =  new LC328().oddEvenList(head);
        System.out.println();
    }

}

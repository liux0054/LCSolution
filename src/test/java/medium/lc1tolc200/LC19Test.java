package medium.lc1tolc200;

import org.junit.Test;

import common.ListNode;
import medium.LC19;

public class LC19Test {

    @Test
    public void testCase1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode ans = new LC19().removeNthFromEnd(head, 2);
        System.out.println("test");
    }

    @Test
    public void testCase2(){
        ListNode head = new ListNode(1);

        ListNode ans = new LC19().removeNthFromEnd(head, 0);
        System.out.println("test");
    }

    @Test
    public void testCase3(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode ans = new LC19().removeNthFromEnd(head, 1);
        System.out.println("test");
    }

    @Test
    public void testCase4(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode ans = new LC19().removeNthFromEnd(head, 2);
        System.out.println("test");
    }
}

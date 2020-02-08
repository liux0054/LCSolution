package medium;

import common.ListNode;
import org.junit.Test;

public class LC92Test {
    @Test
    public void testCase1() {
        ListNode head = new ListNode(1);
        (new LC92()).reverseBetween(head, 1,1);
        System.out.println("passed");
    }

    @Test
    public void testCase2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        (new LC92()).reverseBetween(head, 1,3);
        System.out.println("passed");
    }
}


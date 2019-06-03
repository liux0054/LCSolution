package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import easy.LC141;

public class LC141Test {

    @Test
    public void testCase1(){
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode forth = new ListNode(-4);
        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = second;

        Assert.assertTrue(new LC141().hasCycle(head));
    }

    @Test
    public void testCase2(){
        ListNode head = new ListNode(3);
        Assert.assertFalse(new  LC141().hasCycle(head));
    }

    @Test
    public void testCase3(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        Assert.assertTrue(new  LC141().hasCycle(head));
    }
}

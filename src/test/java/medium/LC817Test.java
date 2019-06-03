package medium;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import medium.LC817;

public class LC817Test {
    @Test
    public void testCase1(){
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        Assert.assertEquals(2, new LC817().numComponents(head, new int[]{0,1,3}));
    }

    @Test
    public void testCase2(){

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);

        Assert.assertEquals(2, new LC817().numComponents(head, new int[]{0, 3, 1, 4}));
    }

    @Test
    public void testCase3(){
        ListNode head = new ListNode(0);
        Assert.assertEquals(1, new LC817().numComponents(head, new int[]{0, 3, 1, 4}));
    }


    @Test
    public void testCase4(){

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        Assert.assertEquals(2, new LC817().numComponents(head, new int[]{0,1,3}));
    }
}

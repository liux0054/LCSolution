package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import easy.lc1tolc200.LC83;

public class LC83Test {

    @Test
    public void testCase1(){

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode actual = new LC83().deleteDuplicates(head);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        while(actual != null || expected != null){
            Assert.assertEquals(actual.val, expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        Assert.assertNull(actual);
        Assert.assertNull(expected);
    }

    @Test
    public void testCase2(){

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next= new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode actual = new LC83().deleteDuplicates(head);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        while(actual != null || expected != null){
            Assert.assertEquals(actual.val, expected.val);
            actual = actual.next;
            expected = expected.next;
        }
        Assert.assertNull(actual);
        Assert.assertNull(expected);
    }
}

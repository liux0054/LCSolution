package easy.LC203;

import org.junit.Assert;
import org.junit.Test;

public class LC203Test {

    @Test
    public void testCase1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        ListNode result = new LC203().removeElements(head, 6);
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertEquals(4, result.next.next.next.val);
        Assert.assertEquals(5, result.next.next.next.next.val);

    }

    @Test
    public void testCase2(){
        ListNode head = new ListNode(6);


        ListNode result = new LC203().removeElements(head, 6);
        Assert.assertNull(result);
    }
}

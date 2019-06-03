package medium;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import medium.LC61;

public class LC61Test {

    @Test
    public void testCase1(){

        //Input: 1->2->3->4->5->NULL, k = 2
        //Output: 4->5->1->2->3->NULL

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        ListNode newHeader = new LC61().rotateRight(head, 2);
        System.out.println("test");
    }


    @Test
    public void testCase2(){

        //Input: 0->1->2->NULL, k = 4
        //Output: 2->0->1->NULL

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);


        ListNode newHeader = new LC61().rotateRight(head, 4);
        System.out.println("test");
    }


    @Test
    public void testCase3(){

        //Input: 0->1->2->NULL, k = 4
        //Output: 2->0->1->NULL

        ListNode head = null;
        Assert.assertNull(new LC61().rotateRight(head, 8));
    }


    @Test
    public void testCase4(){

        //Input: 0->1->2->NULL, k = 4
        //Output: 2->0->1->NULL

        ListNode head = new ListNode(1);
        ListNode newHead = new LC61().rotateRight(head, 100);
        System.out.println("test");
    }

    @Test
    public void testCase5(){

        //Input: 0->1->2->NULL, k = 4
        //Output: 2->0->1->NULL

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode newHead = new LC61().rotateRight(head, 0);
        System.out.println("test");
    }
}

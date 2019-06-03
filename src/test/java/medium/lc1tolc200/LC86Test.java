package medium.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import medium.LC86;

public class LC86Test {

    @Test
    public void testCase1(){
        ListNode listNode = new ListNode(1);
        ListNode tail = listNode;
        ListNode newNode = new ListNode(4);
        tail.next = newNode;
        tail = newNode;
        newNode = new ListNode(3);
        tail.next = newNode;
        tail = newNode;
        newNode = new ListNode(2);
        tail.next = newNode;
        tail = newNode;
        newNode = new ListNode(5);
        tail.next = newNode;
        tail = newNode;
        newNode = new ListNode(2);
        tail.next = newNode;
        tail = newNode;
        tail.next = null;

        //===================//
        ListNode listNode1 = new ListNode(1);
        ListNode tail1 = listNode1;
        ListNode newNode1 = new ListNode(2);
        tail1.next = newNode1;
        tail1 = newNode1;
        newNode1 = new ListNode(2);
        tail1.next = newNode1;
        tail1 = newNode1;
        newNode1 = new ListNode(4);
        tail1.next = newNode1;
        tail1 = newNode1;
        newNode1 = new ListNode(3);
        tail1.next = newNode1;
        tail1 = newNode1;
        newNode1 = new ListNode(5);
        tail1.next = newNode1;
        tail1 = newNode1;
        tail1.next = null;

        ListNode ansListNode = new LC86().partition(listNode, 3);

        while(ansListNode != null && listNode1 != null){
            Assert.assertEquals(ansListNode.val, listNode1.val);
            ansListNode = ansListNode.next;
            listNode1 = listNode1.next;
        }

        Assert.assertNull(ansListNode);
        Assert.assertNull(listNode1);
    }
}

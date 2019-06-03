package easy;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import easy.LC21;

public class LC21Test {

    @Test
    public void testCase1() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(1);
        list3.next = new ListNode(1);
        list3.next.next = new ListNode(2);
        list3.next.next.next = new ListNode(3);
        list3.next.next.next.next = new ListNode(4);
        list3.next.next.next.next.next = new ListNode(4);

        ListNode list4 = new LC21().mergeTwoLists(list1, list2);

        while(list3 != null){
            Assert.assertEquals(list3.val, list4.val);
            list3 = list3.next;
            list4 = list4.next;
        }
    }
}

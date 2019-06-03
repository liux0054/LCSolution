package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import common.ListNode;
import easy.LC234;

public class LC234Test {

    @Test
    public void testCase1(){
        ListNode list1 =  new ListNode(1);
        list1.next = new ListNode(2);
        Assert.assertFalse(new LC234().isPalindrome(list1));
    }

    @Test
    public void testCase2(){
        ListNode list1 =  new ListNode(1);
        Assert.assertTrue(new LC234().isPalindrome(list1));
    }

    @Test
    public void testCase3(){
        ListNode list1 =  new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(1);
        Assert.assertTrue(new LC234().isPalindrome(list1));
    }
}

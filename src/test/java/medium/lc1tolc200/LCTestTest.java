package medium.lc1tolc200;

import org.junit.Test;

import medium.LCTest;


public class LCTestTest {

    @Test
    public void testCase1(){
        LCTest lcTest = new LCTest();
        LCTest.ListNode l1 = lcTest.new ListNode(1);
        l1.next = lcTest.new ListNode(2);
        l1.next.next = lcTest.new ListNode(3);
        l1.next.next.next = lcTest.new ListNode(4);


        LCTest.ListNode l2 = lcTest.new ListNode(2);
        l2.next = lcTest.new ListNode(3);
        l2.next.next = lcTest.new ListNode(4);


        LCTest.ListNode answer = new LCTest().sum(l1, l2);

        System.out.println("test");
    }
}

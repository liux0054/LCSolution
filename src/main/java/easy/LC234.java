package easy;

import common.ListNode;

public class LC234 {
    public boolean isPalindrome(ListNode head) {
       if(head == null) {
           return true;
       }

       ListNode tail = new ListNode(head.val);
       ListNode newNode = tail;
       ListNode currentIndex = head.next;
       while(currentIndex != null){
           newNode = new ListNode(currentIndex.val);
           newNode.next = tail;
           tail = newNode;
           currentIndex = currentIndex.next;
       }
       currentIndex = head;
       while(currentIndex != null){
           if(currentIndex.val != newNode.val){
               return false;
           }
           currentIndex = currentIndex.next;
           newNode = newNode.next;
       }
       return true;
    }
}

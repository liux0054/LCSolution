package medium.lc201tolc400;

import common.ListNode;

public class LC328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode third = head;
        if(third == null){
            return null;
        }

        ListNode second = head.next;
        if(second == null){
            return head;
        }

        ListNode first = head.next.next;
        if(first == null){
            return head;
        }

        ListNode odd = third;
        ListNode even = second;
        odd.next = first;

        while (first != null && second != null){
            second.next = first.next;
            second = second.next;
            if(second != null){
                first.next = second.next;
                first = first.next;
            }
        }

        ListNode pOdd = odd;
        while(pOdd.next != null){
            pOdd = pOdd.next;
        }

        pOdd.next = even;
        return odd;
    }
}

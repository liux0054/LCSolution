package medium.lc1tolc200;

import java.util.ArrayList;
import java.util.List;

import common.ListNode;

public class LC61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tempHead = head;
        if(head == null){
            return null;
        }

        List<Integer> ints = new ArrayList<>();
        int size = 0;
        while(head != null){
            ints.add(head.val);
            size++;
            head = head.next;
        }

        if(size == 1){
            return new ListNode(ints.get(0));
        }

        k = k % size;
        if(k == 0){
            return tempHead;
        }

        ListNode answer = new ListNode(ints.get(ints.size() - k));
        ListNode answerHead = answer;
        for(int i=ints.size()-k+1; i<ints.size(); i++){
            answer.next = new ListNode(ints.get(i));
            answer = answer.next;
        }

        for(int i=0; i<ints.size()-k; i++){
            answer.next = new ListNode(ints.get(i));
            answer = answer.next;
        }

        return answerHead;
    }
}

package easy.lc1tolc200;


import common.ListNode;

public class LC21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        ListNode sorted = new ListNode(0);
        ListNode tail = sorted;

        while (l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                ListNode newNode;
                if(l1.val <= l2.val){
                    newNode = new ListNode(l1.val);
                    l1 = l1.next;
                }else {
                    newNode = new ListNode(l2.val);
                    l2 = l2.next;
                }
                tail.next = newNode;
                tail = newNode;
            }else{
                while(l1 != null){
                    ListNode newNode = new ListNode(l1.val);
                    tail.next = newNode;
                    tail = newNode;
                    l1 = l1.next;
                }

                while(l2 != null){
                    ListNode newNode = new ListNode(l2.val);
                    tail.next = newNode;
                    tail = newNode;
                    l2 = l2.next;
                }
            }
        }
        return sorted.next;
    }
}

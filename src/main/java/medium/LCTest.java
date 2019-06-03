package medium;


public class LCTest {

    class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    public ListNode sum(ListNode listNode1, ListNode listNode2){
        int length1 = 0;
        int length2 = 0;
        ListNode head1 = listNode1;
        ListNode head2 = listNode2;

        while(listNode1 != null){
            length1++;
            listNode1 = listNode1.next;
        }

        while(listNode2 != null){
            length2++;
            listNode2 = listNode2.next;
        }

        int commonLength = Math.max(length1, length2) + 1;

        for(int i=0; i<commonLength-length1; i++){
            ListNode newNode = new ListNode(0);
            newNode.next = head1;
            head1 = newNode;
        }

        for(int i=0; i<commonLength-length2; i++){
            ListNode newNode = new ListNode(0);
            newNode.next = head2;
            head2 = newNode;
        }

        getCarry(head1, head2);
        return head1;
    }

    private int getCarry(ListNode listNode1, ListNode listNode2){
        if(listNode1 == null && listNode2 == null){
            return 0;
        }else{
            int carry = getCarry(listNode1.next, listNode2.next);
            int newCarry = (listNode1.val + listNode2.val + carry)/10;
            listNode1.val = (listNode1.val + listNode2.val + carry) % 10;
            return newCarry;
        }
    }

}

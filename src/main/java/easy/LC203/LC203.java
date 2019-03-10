package easy.LC203;

public class LC203 {

    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }

        if(head == null || head.next == null){
            return head;
        }

        ListNode previous = head;
        ListNode current = head.next;
        while(current != null){
            if(current.val == val){
                current = current.next;
                previous.next = current;
            }else{
                previous = previous.next;
                current = current.next;
            }
        }

        return head;
    }
}

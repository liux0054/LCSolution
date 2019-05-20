package easy.lc1tolc200;

import common.ListNode;
import common.TreeNode;

public class LC109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }
        if(head.next.next == null){
            TreeNode root = new TreeNode(head.val);
            root.right = new TreeNode(head.next.val);
            return root;
        }

        ListNode fastPtr = head;
        ListNode slowPtr  = head;
        ListNode slowPre = head;
        while(fastPtr != null){
            fastPtr = fastPtr.next;
            if(fastPtr != null){
                fastPtr = fastPtr.next;
                slowPre = slowPtr;
                slowPtr = slowPtr.next;
            }
        }

        TreeNode root = new TreeNode(slowPtr.val);
        slowPre.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slowPtr.next);
        return root;
    }
}

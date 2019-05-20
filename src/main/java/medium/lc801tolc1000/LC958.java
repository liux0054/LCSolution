package medium.lc801tolc1000;

import java.util.LinkedList;
import java.util.Queue;

import common.TreeNode;

public class LC958 {

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> nodesList = new LinkedList<>();
        Queue<Integer>  orderList = new LinkedList<>();

        if(root == null){
            return true;
        }

        int order = 1;
        nodesList.add(root);
        orderList.add(order);

        while(!nodesList.isEmpty()){
            root = nodesList.poll();
            if(root.left != null){
                nodesList.offer(root.left);
                orderList.offer(++order);
            }else{
                ++order;
            }
            if(root.right != null){
                nodesList.offer(root.right);
                orderList.offer(++order);
            }else{
                ++order;
            }
        }

        int previous = orderList.poll();
        while(!orderList.isEmpty()){
            if(orderList.peek() - previous != 1){
                return false;
            }
            previous = orderList.poll();
        }
        return true;
    }

}

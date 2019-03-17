package easy;

import java.util.PriorityQueue;

public class LC703 {

}

class KthLargest {

    private PriorityQueue<Integer> numQueue = new PriorityQueue<>();
    private int kIndex;

    public KthLargest(int k, int[] nums) {
        kIndex = k;
        for(int i=nums.length-1; i>=0; i--){
            add(nums[i]);
        }
    }

    public int add(int val) {
       if(numQueue.size() < kIndex){
           numQueue.add(val);
       }else{
           if(val > numQueue.peek()){
               numQueue.poll();
               numQueue.add(val);
           }
       }
       return numQueue.peek();
    }
}

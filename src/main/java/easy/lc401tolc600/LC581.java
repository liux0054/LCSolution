package easy.lc401tolc600;

import java.util.Stack;

public class LC581 {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Integer> index = new Stack<>();

        numStack.push(Integer.MIN_VALUE);
        index.push(-1);
        int minK = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= numStack.peek()){
                numStack.push(nums[i]);
                index.push(i);
            }else{
                while(numStack.peek() > nums[i]){
                    numStack.pop();
                    index.pop();
                }
                if(minK > index.peek()){
                    minK = index.peek();
                }
            }
        }

        if(minK == Integer.MAX_VALUE){
            return 0;
        }

        numStack.clear();
        index.clear();
        numStack.push(Integer.MAX_VALUE);
        index.push(nums.length);
        int maxK = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] <= numStack.peek()){
                numStack.push(nums[i]);
                index.push(i);
            }else{
                while(numStack.peek() < nums[i]){
                    numStack.pop();
                    index.pop();
                }
                if(maxK < index.peek()) {
                    maxK = index.peek();
                }
            }
        }

        if(maxK == Integer.MIN_VALUE){
            return 0;
        }

        return maxK - minK - 1;
    }
}

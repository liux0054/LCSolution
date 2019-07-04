package medium;

import java.util.HashSet;
import java.util.Set;

public class LC565 {
    public int arrayNesting(int[] nums) {
       int maxSize = Integer.MIN_VALUE;
       for(int i=0; i<nums.length; i++){
           maxSize = Math.max(maxSize, getSize(nums, i));
       }
       return maxSize;
    }

    private int getSize(int[] nums, int i){
        Set<Integer> ints = new HashSet<>();
        int number = nums[i];
        while(!ints.contains(number)){
            ints.add(number);
            number = nums[number];
        }
        return ints.size();
    }
}

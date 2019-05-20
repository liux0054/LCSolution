package medium.lc1tolc200;

import java.util.Arrays;

public class LC16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int distance = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
             int j = i + 1;
             int k = nums.length-1;
             while(j < k){
                 if(distance > updateDistance(nums[i], nums[j], nums[k], target, distance)){
                     distance = updateDistance(nums[i], nums[j], nums[k], target, distance);
                     result = nums[i] + nums[j] + nums[k];
                     if(distance == 0) return target;
                 }
                 if(nums[i] + nums[j] + nums[k] < target) j++;
                 else k--;
             }
        }
        return result;
    }

    public int updateDistance(int numsi, int numsj, int numsk, int target, int distance){
        int currentDis = Math.abs(numsi + numsj + numsk - target);
        return distance > currentDis ? currentDis : distance;
    }
}

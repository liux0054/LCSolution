package medium;

import java.util.Arrays;

public class LC462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int median = nums[nums.length/2];
        int answer = 0;
        for(int num : nums){
            answer += Math.abs(median - num);
        }

        return answer;
    }
}

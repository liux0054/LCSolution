package easy.lc1tolc200;

public class LC53 {
    public int maxSubArray(int[] nums) {
       int[][] maxSums = new int[nums.length][2];

       maxSums[0][0] = Integer.MIN_VALUE;
       maxSums[0][1] = nums[0];

       for(int i=1; i<nums.length; i++){
          maxSums[i][0] = Math.max(maxSums[i-1][0], maxSums[i-1][1]);
          maxSums[i][1] = Math.max(maxSums[i-1][1] + nums[i], nums[i]);
       }

       return Math.max(maxSums[nums.length-1][0], maxSums[nums.length-1][1]);
    }
}

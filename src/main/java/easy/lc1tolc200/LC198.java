package easy.lc1tolc200;

public class LC198 {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int[][] sums = new int[nums.length][2];
        sums[0][0] = 0;
        sums[0][1] = nums[0];

        for(int i=1; i<nums.length; i++){
            sums[i][0] = Math.max(sums[i-1][0], sums[i-1][1]);
            sums[i][1] = sums[i-1][0] + nums[i];
        }

        return Math.max(sums[nums.length-1][0], sums[nums.length-1][1]);
    }
}

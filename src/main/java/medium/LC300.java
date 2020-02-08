package medium;

public class LC300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[][] f = new int[nums.length][2];
        f[0][0] = 0;
        f[0][1] = 1;
        for (int i=1; i<f.length; i++) {
            f[i][0] = Math.max(f[i-1][0], f[i-1][1]);
            f[i][1] = 1;
            for (int j=0; j<i; j++) {
                if(nums[j] < nums[i]) {
                    f[i][1] = Math.max(f[i][1], f[j][1]+1);
                }
            }
        }
        return Math.max(f[nums.length-1][0], f[nums.length-1][1]);
    }
}

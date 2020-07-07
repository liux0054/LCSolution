package medium;

public class LC55 {
    public boolean canJump(int[] nums) {
        int lastIndexWithinReach = 0;
        for (int i = 0; i<nums.length; i++) {
            if (lastIndexWithinReach >= i && i + nums[i] > lastIndexWithinReach) {
                lastIndexWithinReach = i + nums[i];
            }
            if (lastIndexWithinReach >= nums.length-1) {
                return true;
            }
        }
        return lastIndexWithinReach >= nums.length-1;
    }
}

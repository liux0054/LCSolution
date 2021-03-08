package medium;

import java.util.HashMap;
import java.util.Map;

public class LC416 {
    Map<String, Boolean> canAchieveMap = new HashMap<>();
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        return canAchieve(nums, sum/2, 0);
    }

    public boolean canAchieve(int[]nums, int sum, int positionFrom) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0 || positionFrom >= nums.length) {
            return false;
        }

        String key = positionFrom + " " + sum;
        if (canAchieveMap.containsKey(key)) {
            return canAchieveMap.get(key);
        }
        boolean canAchieveSum = canAchieve(nums, sum - nums[positionFrom], positionFrom+1) ||
                canAchieve(nums, sum, positionFrom+1);
        canAchieveMap.put(key, canAchieveSum);
        return canAchieveSum;
    }
}

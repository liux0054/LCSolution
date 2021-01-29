package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC494 {
    public int findTargetSumWays(int[] nums, int S) {
        List<Map<Integer, Integer>> countOfWays = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            countOfWays.add(new HashMap<>());
        }

        if (nums[0] != 0) {
            countOfWays.get(0).put(nums[0], 1);
            countOfWays.get(0).put(-nums[0], 1);
        } else {
            countOfWays.get(0).put(0, 2);
        }

        for (int i=1; i<nums.length; i++) {
            for (Integer key : countOfWays.get(i-1).keySet()) {
                if (!countOfWays.get(i).containsKey(key + nums[i])) {
                    countOfWays.get(i).put(key + nums[i], countOfWays.get(i-1).get(key));
                } else {
                    countOfWays.get(i).put(key + nums[i], countOfWays.get(i).get(key + nums[i]) + countOfWays.get(i-1).get(key));
                }

                if (!countOfWays.get(i).containsKey(key - nums[i])) {
                    countOfWays.get(i).put(key - nums[i], countOfWays.get(i-1).get(key));
                } else {
                    countOfWays.get(i).put(key - nums[i], countOfWays.get(i).get(key - nums[i]) + countOfWays.get(i-1).get(key));
                }
            }
        }
        return countOfWays.get(countOfWays.size()-1).getOrDefault(S, 0);
    }
}

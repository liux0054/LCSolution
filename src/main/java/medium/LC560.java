package medium;

import java.util.HashMap;
import java.util.Map;

public class LC560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCount = new HashMap<>();
        int sum = 0;
        for(int num : nums){
            sum += num;
            sumCount.put(sum, sumCount.containsKey(sum) ? (sumCount.get(sum) + 1) : 1);
        }

        int numOfSub = 0;
        for(int key : sumCount.keySet()){
            if(key == k || (sumCount.getOrDefault(key - k, 0) != 0 && sumCount.getOrDefault(key, 0) != 0)) {
                numOfSub++;
            }
        }
        return numOfSub;
    }
}

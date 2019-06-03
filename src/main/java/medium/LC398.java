package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LC398 {

    class Solution{
        private Map<Integer, ArrayList<Integer>> numIndex = new HashMap<>();

        public Solution(int[] nums) {
            for(int i=0; i<nums.length; i++){
                if(numIndex.containsKey(nums[i])){
                    numIndex.get(nums[i]).add(i);
                }else {
                    numIndex.put(nums[i], new ArrayList<>(Arrays.asList(i)));
                }
            }
        }

        public int pick(int target) {
           Random rand = new Random();
           return numIndex.get(target).get(rand.nextInt(numIndex.get(target).size()));
        }
    }
}

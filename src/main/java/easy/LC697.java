package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = getCount(nums);
        Map<Integer, List<Integer>> index = getIndex(nums);

        int degree = 0;
        for(int counter : count.values()){
            if(counter > degree){
                degree = counter;
            }
        }

        int ans = nums.length;

        for(int key : count.keySet()){
            if(count.get(key) == degree){
                List<Integer> occurrence =  index.get(key);
                int min = occurrence.get(0);
                int max = occurrence.get(0);
                for(int occ : occurrence){
                    if(occ > max){
                        max = occ;
                    }
                    if(occ < min){
                        min = occ;
                    }
                }
                if(max - min + 1 < ans){
                    ans = max - min + 1;
                }
            }
        }
        return ans;
    }

    private Map<Integer, Integer> getCount(int[] nums){
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            if(count.containsKey(num)){
                count.put(num, count.get(num) + 1);
            }else{
                count.put(num, 1);
            }
        }
        return count;
    }

    private Map<Integer, List<Integer>> getIndex(int[] nums){
        Map<Integer, List<Integer>> index = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(index.containsKey(nums[i])){
                index.get(nums[i]).add(i);
            }else{
                ArrayList<Integer> value = new ArrayList<>();
                value.add(i);
                index.put(nums[i], value);
            }
        }
        return index;
    }
}

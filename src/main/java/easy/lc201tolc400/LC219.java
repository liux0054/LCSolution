package easy.lc201tolc400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LC219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> index = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(index.containsKey(nums[i])){
                index.get(nums[i]).add(i);
            }else{
                List<Integer> value = new ArrayList<>();
                value.add(i);
                index.put(nums[i], value);
            }
        }

        for(int key:index.keySet()){
            if (index.get(key).size() > 1){
                int[] arr =  index.get(key).stream().mapToInt(i -> i).toArray();
                Arrays.sort(arr);

                for(int i=1; i<arr.length; i++){
                    if(arr[i] - arr[i-1] <= k){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

package easy;

import java.util.HashMap;
import java.util.Map;

public class LC167 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] == numbers[i-1] && target == 2 * numbers[i]){
                return new int[]{i, i+1};
            }
        }

        Map<Integer, Integer> index = getIndex(numbers);
        int[] ans = new int[2];
        for(int key:index.keySet()){
            if(index.containsKey(target - key) && target != 2 * key){
                int index1 = index.get(key);
                int index2 = index.get(target - key);
                ans[0] = Math.min(index1, index2);
                ans[1] = Math.max(index1,  index2);
            }
        }
        return ans;
    }

    private Map<Integer, Integer> getIndex(int[] numbers){
        Map<Integer, Integer> index = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            index.put(numbers[i], i+1);
        }
        return index;
    }
}

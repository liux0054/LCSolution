package easy.lc401tolc600;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC594 {

    public int findLHS(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Arrays.stream(nums).forEach(value -> count.put(value, count.containsKey(value) ? count.get(value) + 1 : 1));

        int max = 0;

        for(Integer key: count.keySet()){
            if(count.containsKey(key+1) && count.get(key+1) + count.get(key) > max){
                max = count.get(key+1) + count.get(key);
            }
        }
        return max;
    }
}

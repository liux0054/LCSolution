package easy.lc401tolc600;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC532 {
    public int findPairs(int[] nums, int k) {
        if(k < 0) {
            return 0;
        }
        Map<Integer, Integer> count = new HashMap<>();
        Arrays.stream(nums).forEach(
            num -> count.put(num, count.containsKey(num) ? (count.get(num) + 1) : 1)
        );
        if(k == 0){
            return (int) count.values().stream().filter(value -> value >= 2).count();
        }else{
            return (int)count.keySet().stream().filter(key -> count.containsKey(key + k)).count();
        }
    }
}

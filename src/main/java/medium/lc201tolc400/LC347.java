package medium.lc201tolc400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LC347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> [] bucket = new List[nums.length+1];
        for(int key:count.keySet()){
            if(bucket[count.get(key)] == null){
                bucket[count.get(key)] = new ArrayList<>();
            }
            bucket[count.get(key)].add(key);
        }

        List<Integer> answer = new LinkedList();
        for(int i=bucket.length-1; i>=0; i--){
            if(k == 0){
                break;
            }
            if(bucket[i] != null){
                for(int key:bucket[i]){
                    answer.add(key);
                    k--;
                }
            }
        }
        return answer;
    }
}

package medium;

import java.util.HashMap;
import java.util.Map;

public class LC454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i:C)
          for(int j:D){
            if (count.get(i+j) != null){
                count.put(i+j, count.get(i+j) + 1);
            }else{
                count.put(i+j, 1);
            }
        }
        int ans = 0;
        for(int i:A)
            for(int j:B)
                if(count.get(-i-j) != null)
                       ans += count.get(-i-j);
        return ans;
    }
}

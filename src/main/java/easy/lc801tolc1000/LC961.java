package easy.lc801tolc1000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC961 {
    public int repeatedNTimes1(int[] A) {
        int n = A.length/2;
        Map<Integer, Integer> count = new HashMap<>();
        for(int a:A){
            count.put(a, count.containsKey(a) ? (count.get(a) + 1) : 1);
        }
        for(Map.Entry entry:count.entrySet()){
            if((Integer) entry.getValue() == n){
                return (Integer) entry.getKey();
            }
        }
        return 0;
    }

    public int repeatedNTimes(int[] A) {
        Set<Integer> ints = new HashSet<>();
        for(int a:A){
            if(ints.contains(a)){
                return a;
            }
            ints.add(a);
        }
        return 0;
    }
}

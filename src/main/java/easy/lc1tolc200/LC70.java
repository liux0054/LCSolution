package easy.lc1tolc200;

import java.util.HashMap;
import java.util.Map;

public class LC70 {

    private Map<Integer, Integer> ways = new HashMap<Integer, Integer>(){{
        put(1, 1);
        put(2, 2);
    }};

    public int climbStairs(int n) {
       if(n==1 || n==2) {
           return n;
       }
       int ways1;
       if(ways.containsKey(n-1)){
           ways1 = ways.get(n-1);
       }else{
           ways1 = climbStairs(n-1);
           ways.put(n-1, ways1);
       }
       int ways2;
       if(ways.containsKey(n-2)){
           ways2 = ways.get(n-2);
       }else{
           ways2 = ways.get(n-2);
           ways.put(n-2, ways2);
       }
       return ways1 + ways2;
    }
}

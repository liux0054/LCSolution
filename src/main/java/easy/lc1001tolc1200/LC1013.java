package easy.lc1001tolc1200;

import java.util.HashMap;
import java.util.Map;


public class LC1013 {
    public int numPairsDivisibleBy60(int[] time) {
       for(int i=0; i<time.length; i++){
           time[i] %= 60;
       }

       Map<Integer, Integer> count = new HashMap<>();
       for(int eachTime:time){
           count.put(eachTime, count.containsKey(eachTime) ? (count.get(eachTime) + 1) : 1);
       }

       int answer = 0;

       for(int i=1; i<30; i++){
           answer += count.getOrDefault(i, 0) * count.getOrDefault(60-i, 0);
       }

       answer += count.getOrDefault(0, 0) * (count.getOrDefault(0, 0) - 1)/2;
       answer += count.getOrDefault(30, 0) * (count.getOrDefault(30, 0) -1)/2;
       return answer;
    }
}

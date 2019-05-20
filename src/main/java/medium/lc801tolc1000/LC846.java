package medium.lc801tolc1000;

import java.util.Map;
import java.util.TreeMap;

public class LC846 {
    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length == 0 || hand.length % W != 0){
            return false;
        }

        Map<Integer, Integer> count = new TreeMap<>();
        for(int ha : hand){
            if(count.containsKey(ha)){
                count.put(ha, count.get(ha)+1);
            }else{
                count.put(ha, 1);
            }
        }

        for(int key : count.keySet()){
            while(count.get(key) != 0){
                for(int j=0; j<W; j++){
                    if(!count.containsKey(key+j) || count.get(key+j) == 0){
                        return false;
                    }else{
                        count.put(key+j, count.get(key+j)-1);
                    }
                }
            }
        }
        return true;
    }
}

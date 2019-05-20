package medium.lc401tolc600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC451 {
    public String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(Character c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        List<Character> [] bucket = new List[s.length()+1];
        for(Character key : count.keySet()){
            if(bucket[count.get(key)] == null){
                bucket[count.get(key)] = new ArrayList<>();
            }
            bucket[count.get(key)].add(key);
        }

        StringBuilder answer = new StringBuilder();

        for(int i=bucket.length-1; i>0; i--){
            if(bucket[i] != null){
                for(Character c:bucket[i]){
                    for(int j=0; j<i; j++){
                        answer.append(c);
                    }
                }
            }
        }

        return answer.toString();
    }
}

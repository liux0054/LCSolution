package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LC599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for(int i=0; i<list1.length; i++){
            map1.put(list1[i], i);
        }

        for(int i=0; i<list2.length; i++){
            map2.put(list2[i], i);
        }

        int minSumOfCommonIndex = 1000;
        List<String> answer = new ArrayList<>();
        for(String key1 : map1.keySet()){
            int currentSumOfIndex = map1.get(key1) + map2.getOrDefault(key1, 1000);
            if(currentSumOfIndex < minSumOfCommonIndex){
                answer.clear();
                answer.add(key1);
                minSumOfCommonIndex = currentSumOfIndex;
            }else if(currentSumOfIndex == minSumOfCommonIndex){
                answer.add(key1);
            }
        }
        return answer.toArray(new String[0]);
    }
}

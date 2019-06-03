package easy;

import java.util.HashMap;
import java.util.Map;

public class LC409 {

    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(Character c:s.toCharArray()){
            count.put(c, count.containsKey(c) ? count.get(c)+1 :1);
        }

        int ans = 0;
        boolean oddExist = false;
        for(Map.Entry entry : count.entrySet()){
            if((Integer)entry.getValue() % 2 == 0){
                ans += (Integer) entry.getValue();
            }else{
                ans += (Integer) entry.getValue() - 1;
                oddExist = true;
            }
        }
        return oddExist ? ans + 1 : ans;
    }
}

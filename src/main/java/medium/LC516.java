package medium;

import java.util.HashMap;
import java.util.Map;

public class LC516 {

    public int longestPalindromeSubseq(String s) {
        if(s.length() == 1){
            return 1;
        }
        Map<Character, Integer> count = new HashMap<>();
        for(Character c: s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0)+1);
        }

        int answer = 0;
        boolean oddExist = false;
        for(int value : count.values()){
            if(value % 2 == 0){
                answer += value;
            }else{
                answer += value-1;
                oddExist = true;
            }
        }

        if(oddExist){
            answer++;
        }

        return answer;
    }
}

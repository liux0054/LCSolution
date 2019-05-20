package easy.lc201tolc400;

import java.util.HashMap;
import java.util.Map;

public class LC389 {
    public char findTheDifference1(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        for(Character c:s.toCharArray()){
            count.put(c, count.containsKey(c) ? count.get(c)+1:1);
        }

        for(Character c:t.toCharArray()){
            count.put(c, count.containsKey(c) ? count.get(c)+1:1);
        }


        for(Map.Entry entry:count.entrySet()){
            if((Integer) entry.getValue() % 2 == 1){
                return (char)entry.getKey();
            }
        }
        return 'a';
    }

    public char findTheDifference(String s, String t) {
        int sum = t.charAt(t.length()-1);
        for(int i=0; i<s.length(); i++){
            sum += t.charAt(i) - s.charAt(i);
        }
        return (char)sum;
    }
}

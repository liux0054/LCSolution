package easy.lc201tolc400;

import java.util.HashMap;
import java.util.Map;

public class LC205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0; i<s.length(); i++){
             Character c1 = s.charAt(i);
             Character c2 = t.charAt(i);
             if(mapping.containsKey(c1)){
                 if(!mapping.get(c1).equals(c2)){
                     return false;
                 }
             }else{
                 mapping.put(c1, c2);
             }
        }
        return mapping.values().stream().distinct().count() == mapping.values().size();
    }
}

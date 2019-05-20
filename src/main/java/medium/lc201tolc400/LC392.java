package medium.lc201tolc400;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class LC392 {
    public boolean isSubsequence1(String s, String t) {
        int previousIndex = -1;
        Map<Character, LinkedList<Integer>> indexes = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(indexes.get(t.charAt(i)) == null){
                LinkedList<Integer> value = new LinkedList<>();
                value.add(i);
                indexes.put(t.charAt(i), value);
            }else{
                indexes.get(t.charAt(i)).add(i);
            }
        }

        for(Character c:s.toCharArray()){
            if(!indexes.containsKey(c)){
                return false;
            }
            while(!indexes.get(c).isEmpty() && indexes.get(c).getFirst() <= previousIndex){
                indexes.get(c).pollFirst();
            }
            if(!indexes.get(c).isEmpty()){
                previousIndex = indexes.get(c).pollFirst();
            }else{
                return false;
            }
        }
        return true;
    }


    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        while(i<s.length() && j<t.length()){
            if(sArray[i] == tArray[j]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i == s.length();
    }
}

package medium.lc801tolc1000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> answer = new ArrayList<>();
        for(String word : words){
            if(word.length() == pattern.length()){
                Map<Character, Character> mapping1 = new HashMap<>();
                Map<Character, Character> mapping2 = new HashMap<>();
                boolean mapped = true;
                for(int i=0; i<word.length(); i++){
                    if(!mapping1.containsKey(pattern.charAt(i))){
                        mapping1.put(pattern.charAt(i), word.charAt(i));
                    }else{
                        if(mapping1.get(pattern.charAt(i)) != word.charAt(i)){
                            mapped = false;
                        }
                    }

                    if(!mapping2.containsKey(word.charAt(i))){
                        mapping2.put(word.charAt(i), pattern.charAt(i));
                    }else{
                        if(mapping2.get(word.charAt(i)) != pattern.charAt(i)){
                            mapped = false;
                        }
                    }
                }
                if(mapped){
                    answer.add(word);
                }
            }
        }
        return answer;
    }
}

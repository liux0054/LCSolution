package medium;

import java.util.HashMap;
import java.util.Map;

public class LC869 {
    public boolean reorderedPowerOf2(int N) {
        StringBuilder sb = new StringBuilder();
        sb.append(N);

        int i = 1;
        while(true){
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            if(sb2.length() > sb.length()){
                break;
            }else if(sb2.length() == sb.length()){
                Map<Character, Integer> cCount1 = new HashMap<>();
                Map<Character, Integer> cCount2 = new HashMap<>();
                for(int j=0; j<sb.length(); j++){
                    cCount1.put(sb.charAt(j), cCount1.getOrDefault(sb.charAt(j), 0) + 1);
                }

                for(int j=0; j<sb2.length(); j++){
                    cCount2.put(sb2.charAt(j), cCount2.getOrDefault(sb2.charAt(j), 0) + 1);
                }

                if(cCount1.keySet().containsAll(cCount2.keySet()) && cCount2.keySet().containsAll(cCount1.keySet())){
                    boolean same = true;
                    for(Character key : cCount1.keySet()){
                        if(!cCount1.get(key).equals(cCount2.get(key))){
                            same = false;
                            break;
                        }
                    }
                    if(same){
                        return true;
                    }
                }
            }
            i *= 2;
        }
        return false;
    }
}

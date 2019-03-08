package easy;

import java.util.HashMap;
import java.util.Map;

public class LC859 {
    public boolean buddyStrings(String A, String B) {
        if(A == null || B == null || A=="" || B=="" || A.length() != B.length()){
            return false;
        }
        int countOfDifference=0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                countOfDifference++;
            }
        }
        if(countOfDifference > 2) {
            return false;
        }
        int firstDiffIndex=-1;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                if(firstDiffIndex == -1){
                    firstDiffIndex = i;
                }
                else{
                    return A.charAt(firstDiffIndex) == B.charAt(i) && A.charAt(i) == B.charAt(firstDiffIndex);
                }
            }
        }
        Map<Character, Integer> count = new HashMap<>();
        if(firstDiffIndex == -1){
            A.chars().mapToObj(c -> (char) c).forEach(
                chara -> count.put(chara, count.containsKey(chara) ? (count.get(chara) + 1) : 1)
            );
        }
        return count.values().stream().anyMatch(numberOfOccurrence -> numberOfOccurrence >= 2);
    }
}

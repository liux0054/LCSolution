package medium.lc201tolc400;

import java.util.HashSet;
import java.util.Set;

public class LC260 {
    public int[] singleNumber(int[] nums) {
       Set<Integer> numSet = new HashSet();
       for(int num : nums){
           if(numSet.contains(num)){
               numSet.remove(num);
           }else{
               numSet.add(num);
           }
       }
       int[] answer = new int[2];
       int k=0;
       for(Integer value : numSet){
           answer[k] = value;
           k++;
       }
       return answer;
    }
}

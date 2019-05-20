package easy.lc201tolc400;

import java.util.HashSet;
import java.util.Set;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> appear = new HashSet<>();
        for(int num : nums){
            if(appear.contains(num)){
                return true;
            }
            appear.add(num);
        }
        return false;
    }
}

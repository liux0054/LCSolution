import java.util.HashSet;
import java.util.Set;

public class LC523 {

    public boolean checkSubarraySum(int[] nums, int k) {
        if(k==0){
            for(int i=1; i<nums.length; i++)
                if(nums[i-1] == 0 && nums[i] == 0) return true;
            return false;
        }
        int[] sums = new int[nums.length + 1];
        for(int i=0; i<nums.length; i++)
            sums[i+1] = sums[i] + nums[i];
        for(int i=1; i<sums.length; i++)
            sums[i] %= k;
        Set<Integer> reminder = new HashSet<>();
        for(int i=1; i<sums.length; i++){
            if(reminder.contains(sums[i]) || (sums[i] == 0 && i>=2)) return true;
            else reminder.add(sums[i]);
        }
        return false;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                int k = j + 1;
                int l = nums.length - 1;
                while(k < l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        List<Integer> tempAns = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        if(!ans.contains(tempAns)) ans.add(tempAns);
                    }
                    if(sum < target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }


}

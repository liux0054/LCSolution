package medium.lc1tolc200;

import java.util.ArrayList;
import java.util.List;

public class LC78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
           getSubset(ans, new ArrayList<>(), nums, i);
        }
        ans.add(new ArrayList<>());
        return ans;
    }

    public void getSubset(List<List<Integer>> sum, List<Integer> temp, int[] nums, int currIndex){
        if(currIndex < nums.length){
            temp.add(nums[currIndex]);
            sum.add(new ArrayList<>(temp));
            for(int j=currIndex+1; j<nums.length; j++){
                getSubset(sum, temp, nums, j);
            }
            temp.remove(new Integer(nums[currIndex]));
        }else{
            return;
        }
    }
}

package medium.lc1tolc200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC90{
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            getSubset(ans, new ArrayList<>(), nums, i);
        }
        ans.add(new ArrayList<>());
        return ans;
    }

    public void getSubset(List<List<Integer>> sum, List<Integer> temp, int[] nums, int currIndex){
        if(currIndex < nums.length){
            temp.add(nums[currIndex]);
            if(!sum.contains(temp)) sum.add(new ArrayList<>(temp));
            for(int j=currIndex+1; j<nums.length; j++){
                getSubset(sum, temp, nums, j);
            }
            temp.remove(new Integer(nums[currIndex]));
        }else{
            return;
        }
    }
}

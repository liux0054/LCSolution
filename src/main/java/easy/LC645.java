package easy;

import java.util.Arrays;

public class LC645 {
    public int[] findErrorNums(int[] nums) {
        int[] countOfAppearance = new int[nums.length+1];
        int[] ans = new int[2];
        Arrays.stream(nums).forEach(
            value -> {
                countOfAppearance[value] ++;
            }
        );

        for(int i=1; i<countOfAppearance.length; i++){
            if(countOfAppearance[i] == 2){
                ans[0] = i;
            }
            if(countOfAppearance[i] == 0){
                ans[1] = i;
            }
        }
        return ans;
    }
}

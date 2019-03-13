package easy;

public class LC724 {
    public int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            sums[i] = sums[i-1] + nums[i];
        }

        if(sums[sums.length-1] - sums[0] == 0){
            return 0;
        }


        for(int i=1; i<sums.length-1; i++){
            if(sums[i-1] == sums[nums.length-1] - sums[i]){
                return i;
            }
        }



        if(sums[sums.length-2] == 0){
            return sums.length-1;
        }

        return -1;
    }
}

package medium;

public class LC31 {
    public void nextPermutation(int[] nums) {
        int leftSwap = -1;
        int rightSwap = -1;
        for(int last = nums.length - 1; last>0; last--){
            for(int i=last-1; i>=0; i--){
                if(nums[i] < nums[last]){
                    if(i > leftSwap){
                        leftSwap = i;
                        rightSwap = last;
                    }
                }
            }
        }
        if(leftSwap != -1){
            int temp = nums[leftSwap];
            nums[leftSwap] = nums[rightSwap];
            nums[rightSwap] = temp;
            return;
        }

        for(int i=0; i<nums.length/2; i++){
            int temp =  nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
    }
}

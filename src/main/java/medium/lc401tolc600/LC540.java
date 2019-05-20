package medium.lc401tolc600;

public class LC540 {
    public int singleNonDuplicate(int[] nums) {
       if(nums.length == 1){
           return nums[0];
       }
       int i=0;

       while(i<nums.length-1){
           if(nums[i] != nums[i+1]){
               return nums[i];
           }
           i += 2;
       }
       return nums[i];
    }
}

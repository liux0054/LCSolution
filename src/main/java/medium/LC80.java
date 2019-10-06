package medium;

public class LC80 {
    public int removeDuplicates(int[] nums) {
       int i=0;
       int j=i;
       int countOfDuplication = 0;
       while(j < nums.length - countOfDuplication){
           while(j < nums.length && nums[j] == nums[i]){
               j++;
           }
           if(j - i > 2){
               countOfDuplication += j-i-2;
               for(int k=i+2; k<nums.length-1-countOfDuplication; k++){
                      nums[k] = nums[k+countOfDuplication];
               }
               i += 2;
           }else{
               i = j;
           }
           j=i;
       }
       return nums.length - countOfDuplication;
    }
}

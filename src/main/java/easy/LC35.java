package easy;

public class LC35 {
    public int searchInsert(int[] nums, int target) {
       int begin =0;
       int end = nums.length-1;
       int mid = (begin + end)/2;
       while(begin < end){
           mid = (begin + end)/2;
           if (nums[mid] == target) {
               return mid;
           }
           else if(nums[mid] > target){
               end = mid;
           }else{
               begin = mid;
           }
       }
       return mid;
    }
}

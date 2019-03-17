package easy;

public class LC35 {
    public int searchInsert(int[] nums, int target) {
       int begin =0;
       int end = nums.length-1;
       int mid = (begin + end)/2;
       while(begin <= end){
           mid = (begin + end)/2;
           if (nums[mid] == target) {
               return mid;
           }
           else if(nums[mid] > target){
               end = mid;
           }else{
               begin = mid;
           }
           if(end - begin == 1 || end == begin){
               if(nums[begin] == target){
                   return begin;
               }else if(nums[end] == target){
                   return end;
               }else if(nums[end] < target){
                   return end+1;
               }else if(nums[begin] > target){
                   return 0;
               }else if(nums[begin] < target && target < nums[end]){
                   return end;
               }
           }
       }
       return mid;
    }
}

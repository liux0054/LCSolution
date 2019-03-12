package easy;

public class LC26 {
    public int removeDuplicates1(int[] nums) {
        int begin = 0;
        int end = 0;
        int countOfDuplicate = 0;
        while(end < nums.length - countOfDuplicate){
            while(end < nums.length - countOfDuplicate && nums[end] == nums[begin]){
                end++;
            }
            if(end - begin > 1){
                for(int i=begin+1; i<nums.length - countOfDuplicate-1; i++){
                    if(end + i - begin - 1 <nums.length){
                        nums[i] = nums[end + i - begin - 1];
                    }
                }
                countOfDuplicate += end - begin -1;
                begin = begin + 1;
                end = begin;
            }else{
                begin = end;
                end = begin;
            }
        }
        return nums.length - countOfDuplicate;
    }


    public int removeDuplicates(int[] nums) {
        int begin = 0;
        int end = 0;
        int countOfDuplicate = 0;
        while(end < nums.length - countOfDuplicate){
            while(end < nums.length - countOfDuplicate && nums[end] == nums[begin]){
                end++;
            }
            if(end - begin > 1){
                nums[begin+1]=nums[end];
                countOfDuplicate += end - begin -1;
                begin = begin + 1;
                end = begin;
            }else{
                begin = end;
                end = begin;
            }
        }
        return nums.length - countOfDuplicate;
    }
}

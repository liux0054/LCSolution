package easy.lc601tolc800;

public class LC704 {

    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }

        int begin = 0;
        int end = nums.length-1;

        while(begin<=end){
            if(nums[begin] == target){
                return begin;
            }
            if(nums[end] == target){
                return end;
            }
            if(end - begin <= 1){
                return -1;
            }
            int mid = (begin + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid;
            }else{
                begin = mid;
            }
        }
        return -1;
    }
}
